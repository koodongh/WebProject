package com.multi.shampoorang.dao;

import java.util.ArrayList;

import com.multi.shampoorang.model.AnalysisVO;

public interface IAnalysisDAO {

	ArrayList<AnalysisVO> analysisList();
	ArrayList<AnalysisVO> memberAnalysisList(String member_id);
	void Ocr(AnalysisVO ocr);
}
