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
		AnalysisVO analVO = dao.analysis(sid);
		String ocr_text = analVO.getOcr_text();

		String[] ocr_text_arr = ocr_text.split(" ");

		ArrayList<OcrJoinVO> ocrJoinList = new ArrayList<OcrJoinVO>();

		for (int i = 0; i < ocr_text_arr.length; i++) {
			System.out.println(ocr_text_arr[i]);
			OcrJoinVO ocrJoinVO = new OcrJoinVO();
			ProductVO prdVO = prdDao.productDetailView(ocr_text_arr[i].trim());

				if(prdVO != null) {
				ocrJoinVO.setResult_id(analVO.getResult_id());
				ocrJoinVO.setMember_id(analVO.getMember_id());
				ocrJoinVO.setIngd_name(prdVO.getingd_name());
				ocrJoinVO.setEwg(prdVO.getewg());
				ocrJoinVO.setHazzard(prdVO.gethazzard());
				ocrJoinVO.setDescription(prdVO.getdescription());
				ocrJoinVO.setEwg_encode(prdVO.getewg_encode());
				
				ocrJoinList.add(ocrJoinVO);
				}
					
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
			 


