package com.multi.shampoorang.dao;

import java.util.ArrayList;

import com.multi.shampoorang.model.AnalysisVO;
import com.multi.shampoorang.model.OcrJoinVO;

public interface IAnalysisDAO {

	ArrayList<AnalysisVO> analysisList();
	ArrayList<AnalysisVO> detailResult(String result_id);
	ArrayList<AnalysisVO> memberAnalysisList(String member_id);
	void Ocr(AnalysisVO ocr);
	AnalysisVO analysis(String sid);
	ArrayList<OcrJoinVO> ocrJoinList();
	/*
	 * public ArrayList<JoinVO> joinList();
	 */}
