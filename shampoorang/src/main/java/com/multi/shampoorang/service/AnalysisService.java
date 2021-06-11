package com.multi.shampoorang.service;

import java.util.HashMap;

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
	public AnalysisVO AnalysisCheck(String ocr_text) {

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("ocr_text", ocr_text);
		return dao.AnalysisCheck(map);
	}
	
	
	@Override	 
	public void join(AnalysisVO ana) {
		dao.join(ana);
	}
	

}
