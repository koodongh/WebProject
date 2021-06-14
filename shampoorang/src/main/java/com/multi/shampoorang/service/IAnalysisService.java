package com.multi.shampoorang.service;

import java.util.ArrayList;

import com.multi.shampoorang.model.AnalysisVO;

public interface IAnalysisService {

	ArrayList<AnalysisVO> analysisList();
	ArrayList<AnalysisVO> detailResult(String result_id);
	ArrayList<AnalysisVO> memberAnalysisList(String member_id);
	void Ocr(AnalysisVO ocr);


}
