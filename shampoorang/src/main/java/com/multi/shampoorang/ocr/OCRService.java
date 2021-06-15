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
import java.util.ArrayList;
import java.util.List;
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

			System.out.println(response);  		
			System.out.println(response.toString()); 
			
			result = jsonToString(response.toString()); 
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
	
	public String jsonToString(String jsonStr) {
		String resultText = "";
		List<String> list = null;
		list = new ArrayList<String>(); 
		int count =0;

		
		JSONObject jsonObj = new JSONObject(jsonStr);
		
		JSONArray imgArray = (JSONArray)jsonObj.get("images");

		JSONObject imgObj =  (JSONObject)imgArray.get(0);
		

		JSONArray fieldsArray = (JSONArray) imgObj.get("fields");
		
		if(fieldsArray != null) {
			String allStr = "";
			for(int i=0; i<fieldsArray.length(); i++) {  
				JSONObject tempObj = (JSONObject)fieldsArray.get(i);
				String str = (String)tempObj.get("inferText");	
				allStr += str.trim();				
			}
			String[] array = allStr.split(",");
			count++;
			for(int j=0 ; j<array.length ; j++) {
				list.add(resultText += array[j] + " ");
			}
		}else {
			System.out.println("");
		}		
		return resultText; 
	}
	
}







