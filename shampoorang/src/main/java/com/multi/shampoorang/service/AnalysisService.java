package com.multi.shampoorang.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.multi.shampoorang.dao.IAnalysisDAO;
import com.multi.shampoorang.dao.IProductDAO;
import com.multi.shampoorang.model.AnalysisVO;
import com.multi.shampoorang.model.JoinVO;
import com.multi.shampoorang.model.OcrJoinVO;
import com.multi.shampoorang.model.ProductVO;

@Service
public class AnalysisService implements IAnalysisService {

	@Autowired
	@Qualifier("IAnalysisDAO")
	IAnalysisDAO dao;
	
	
	@Autowired
	@Qualifier("IProductDAO")
	IProductDAO prdDao;
	
	@Override
	public ArrayList<AnalysisVO> analysisList() {
		return dao.analysisList();
	}

	@Override	 
	public void Ocr(AnalysisVO ocr) {
		dao.Ocr(ocr);
	}
	
	@Override
	public ArrayList<AnalysisVO> detailResult(String result_id) {
		return dao.detailResult(result_id);
	}
	
	@Override
	public ArrayList<AnalysisVO> memberAnalysisList(String member_id) {
		return dao.memberAnalysisList(member_id);
	}
	
	@Override
	public ArrayList<OcrJoinVO> ocrJoinList(String sid) {
		// OCR_result 테이블에서 sid 회원에 해당되는 ocr_text 받아옴
		AnalysisVO analVO = dao.analysis(sid);			
		String ocr_text = analVO.getOcr_text();
		
		// ocr_text에서 스페이스를 구분자로 하여 split() 사용해서 ingd_name 추출 - 배열로 만들어짐		
		String[] ocr_text_arr = ocr_text.split(" ");
		//System.out.println(Arrays.toString(ocr_text_arr));		
		
		ArrayList<OcrJoinVO> ocrJoinVOList = new ArrayList<OcrJoinVO>();
		
		// 배열의 각 ingd_name 하나씩 ingd_list에서 비교하여 일치하는 ProductVO 1개(1행) 받아와서 
		// ArrayList<OcrJoinVO>에 추가
		for(int i = 0; i < ocr_text_arr.length; i++) {		
			System.out.println(ocr_text_arr[i]);	
			OcrJoinVO ocrJoinVO = new OcrJoinVO();
			ProductVO prdVO = prdDao.productDetailView(ocr_text_arr[i].trim());
			
			//if(prdVO != null) {					
				ocrJoinVO.setResult_id(analVO.getResult_id());
				ocrJoinVO.setMember_id(analVO.getMember_id());
				ocrJoinVO.setIngd_name(prdVO.getingd_name());
				ocrJoinVO.setEwg(prdVO.getewg());
				ocrJoinVO.setHazzard(prdVO.gethazzard());
				ocrJoinVO.setDescription(prdVO.getdescription());
				ocrJoinVO.setEwg_encode(prdVO.getewg_encode());						
				
			//} else {
			/*ocrJoinVO.setResult_id("없음");
			ocrJoinVO.setMember_id("없음");
			ocrJoinVO.setIngd_name("없음");
			ocrJoinVO.setEwg("없음");
			ocrJoinVO.setHazzard(0);
			ocrJoinVO.setDescription("없음");
			ocrJoinVO.setEwg_encode(0);	*/
			//}		
				
			/*System.out.println(ocrJoinVO.getResult_id());
			System.out.println(ocrJoinVO.getMember_id());
			System.out.println(ocrJoinVO.getIngd_name());
			System.out.println(ocrJoinVO.getEwg());
			System.out.println(ocrJoinVO.getHazzard());
			System.out.println(ocrJoinVO.getDescription());
			System.out.println(ocrJoinVO.getEwg_encode());
			*/
			ocrJoinVOList.add(ocrJoinVO);
		}
		
		return ocrJoinVOList;
	}
	
	/*
	 * @Override public ArrayList<JoinVO> joinList() { return dao.joinList(); }
	 */
}
