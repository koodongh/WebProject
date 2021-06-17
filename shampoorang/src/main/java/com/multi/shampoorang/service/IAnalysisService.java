package com.multi.shampoorang.service;

import java.util.ArrayList;

import com.multi.shampoorang.model.AnalysisVO;
import com.multi.shampoorang.model.OcrJoinVO;

public interface IAnalysisService {

	ArrayList<AnalysisVO> analysisList();
	ArrayList<AnalysisVO> memberAnalysisList(String member_id);
	void Ocr(AnalysisVO ocr);
	ArrayList<OcrJoinVO> ocrJoinList(String sid);
	ArrayList<OcrJoinVO> resultJoinList(String result_id);
	
}
