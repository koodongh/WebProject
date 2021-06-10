package com.multi.shampoorang.ocr;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.UUID;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class OCRService {
	public String clovaOCRService(String filePathName) {
		
		String result = "";
		
		String apiURL = "https://5e78a5e6a725444e89a18094bfdbe08a.apigw.ntruss.com/custom/v1/8911/4f2242ae2d8951cfba560fbc560883694eb0b523b0d24f1e779431c440d8c8a2/general";
		String secretKey = "c1R4VGlQaHV5b0ZRb1didHhkRXJvSFl1TlZ2ZE1pdkQ=";
		String imageFile = filePathName;		

		try {
			URL url = new URL(apiURL);
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			con.setUseCaches(false);
			con.setDoInput(true);
			con.setDoOutput(true);
			con.setReadTimeout(30000);
			con.setRequestMethod("POST");
			String boundary = "----" + UUID.randomUUID().toString().replaceAll("-", "");
			con.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + boundary);
			con.setRequestProperty("X-OCR-SECRET", secretKey);

			JSONObject json = new JSONObject();
			json.put("version", "V2");
			json.put("requestId", UUID.randomUUID().toString());
			json.put("timestamp", System.currentTimeMillis());
			JSONObject image = new JSONObject();
			image.put("format", "jpg");
			image.put("name", "demo");
			JSONArray images = new JSONArray();
			images.put(image);
			json.put("images", images);
			String postParams = json.toString();

			con.connect();
			DataOutputStream wr = new DataOutputStream(con.getOutputStream());
			long start = System.currentTimeMillis();
			File file = new File(imageFile);
			writeMultiPart(wr, postParams, file, boundary);
			wr.close();

			int responseCode = con.getResponseCode();
			BufferedReader br;
			if (responseCode == 200) {
				br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			} else {
				br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}
			String inputLine;
			StringBuffer response = new StringBuffer();
			while ((inputLine = br.readLine()) != null) {
				response.append(inputLine);
			}
			br.close();

			System.out.println(response);  //JSON �삎�떇�쓽 臾몄옄�뿴 異쒕젰			
			System.out.println(response.toString()); 
			
			result = jsonToString(response.toString()); // 寃곌낵 諛섑솚
			System.out.println(result);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return result;
	}
	
	private static void writeMultiPart(OutputStream out, String jsonMessage, File file, String boundary) throws
	IOException {
	StringBuilder sb = new StringBuilder();
	sb.append("--").append(boundary).append("\r\n");
	sb.append("Content-Disposition:form-data; name=\"message\"\r\n\r\n");
	sb.append(jsonMessage);
	sb.append("\r\n");

	out.write(sb.toString().getBytes("UTF-8"));
	out.flush();

	if (file != null && file.isFile()) {
		out.write(("--" + boundary + "\r\n").getBytes("UTF-8"));
		StringBuilder fileString = new StringBuilder();
		fileString
			.append("Content-Disposition:form-data; name=\"file\"; filename=");
		fileString.append("\"" + file.getName() + "\"\r\n");
		fileString.append("Content-Type: application/octet-stream\r\n\r\n");
		out.write(fileString.toString().getBytes("UTF-8"));
		out.flush();

		try (FileInputStream fis = new FileInputStream(file)) {
			byte[] buffer = new byte[8192];
			int count;
			while ((count = fis.read(buffer)) != -1) {
				out.write(buffer, 0, count);
			}
			out.write("\r\n".getBytes());
		}

		out.write(("--" + boundary + "--\r\n").getBytes("UTF-8"));
	}
	out.flush();
 }
	
	// �씠誘몄��뿉�꽌 �뀓�뒪�듃 異붿텧 
	// JSON �삎�떇�쓽 臾몄옄�뿴�뿉�꽌 �뀓�뒪�듃留� 異붿텧�빐�꽌 臾몄옄�뿴 諛섑솚 : inferText 媛� 異붿텧
	public String jsonToString(String jsonStr) {
		String resultText = "";
		
		// 異붿텧�븷 �삤釉뚯젥�듃 : images , fields, inferText�쓽 媛�
		JSONObject jsonObj = new JSONObject(jsonStr);
		
		//jsonObj�뿉�꽌 images  異붿텧 : 由ъ뒪�듃 
		JSONArray imgArray = (JSONArray)jsonObj.get("images");
		//由ъ뒪�듃�쓽 �슂�냼媛� 1媛쒕컰�뿉 �뾾�쑝誘�濡� index瑜� 0�쑝濡� 吏��젙
		JSONObject imgObj =  (JSONObject)imgArray.get(0);
		
		// fields 異붿텧 : 由ъ뒪�듃
		JSONArray fieldsArray = (JSONArray) imgObj.get("fields");
		
		if(fieldsArray != null) {
			for(int i=0; i<fieldsArray.length(); i++) {  //size()媛� �븘�땲怨� length() (org.json.JSONArray�궗�슜)
				JSONObject tempObj = (JSONObject)fieldsArray.get(i);
				String str = (String)tempObj.get("inferText");
				resultText += str + " ";
			}
		}else {
			System.out.println("�뾾�쓬");
		}		
		return resultText;
	}
	
}







