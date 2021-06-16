package com.multi.shampoorang.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.multi.shampoorang.dao.IAnalysisDAO;
import com.multi.shampoorang.dao.IProductDAO;
import com.multi.shampoorang.model.AnalysisVO;
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

	/*
	 * @Override public void Ocr(AnalysisVO ocr) { String sid = "test1"; // 이후 세션에서
	 * 받아오는걸로 할거임 AnalysisVO analVO = dao.analysis(sid);
	 * 
	 * ArrayList<AnalysisVO> ocrVO = new ArrayList<AnalysisVO>(); // String
	 * member_id = analVO.getMember_id(); dao.Ocr(analVO); }
	 */


	  
	  @Override public void Ocr(AnalysisVO ocr) {
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

		AnalysisVO analVO = dao.analysis(sid);
		String ocr_text = analVO.getOcr_text();

		String[] ocr_text_arr = ocr_text.split(" ");

		ArrayList<OcrJoinVO> ocrJoinList = new ArrayList<OcrJoinVO>();

		for (int i = 0; i < ocr_text_arr.length; i++) {
			/* System.out.println(ocr_text_arr[i]); */
			OcrJoinVO ocrJoinVO = new OcrJoinVO();
			//System.out.println(ocrJoinVO.getResult_id());
			ProductVO prdVO = prdDao.productDetailView(ocr_text_arr[i].trim());
			
			if (prdVO != null) {
				ocrJoinVO.setResult_id(analVO.getResult_id());
				ocrJoinVO.setMember_id(analVO.getMember_id());
				ocrJoinVO.setIngd_name(prdVO.getingd_name());
				ocrJoinVO.setEwg(prdVO.getewg());
				ocrJoinVO.setHazzard(prdVO.gethazzard());
				ocrJoinVO.setDescription(prdVO.getdescription());
				ocrJoinVO.setEwg_encode(prdVO.getewg_encode());
			}
			else {
				/*
				 * ocrJoinVO.setResult_id("없음"); ocrJoinVO.setMember_id("없음");
				 * ocrJoinVO.setIngd_name("없음"); ocrJoinVO.setEwg("없음");
				 * ocrJoinVO.setHazzard(0); ocrJoinVO.setDescription("없음");
				 * ocrJoinVO.setEwg_encode(0);
				 */
			}

			ocrJoinList.add(ocrJoinVO);
		}

		return ocrJoinList;
	}


}
/*
 * System.out.println(ocrJoinVO.getResult_id());
 * System.out.println(ocrJoinVO.getMember_id());
 * System.out.println(ocrJoinVO.getIngd_name());
 * System.out.println(ocrJoinVO.getEwg());
 * System.out.println(ocrJoinVO.getHazzard());
 * System.out.println(ocrJoinVO.getDescription());
 * System.out.println(ocrJoinVO.getEwg_encode());
 */
