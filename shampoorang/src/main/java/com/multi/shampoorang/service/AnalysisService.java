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
	

}
