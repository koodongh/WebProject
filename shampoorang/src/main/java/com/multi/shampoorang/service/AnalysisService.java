package com.multi.shampoorang.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.multi.shampoorang.dao.IAnalysisDAO;
import com.multi.shampoorang.model.AnalysisVO;

@Service
public class AnalysisService implements IAnalysisService {

	@Autowired
	@Qualifier("IAnalysisDAO")
	IAnalysisDAO dao;

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
}
