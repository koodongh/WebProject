package com.multi.shampoorang.dao;

import java.util.ArrayList;

import com.multi.shampoorang.model.AnalysisVO;

public interface IAnalysisDAO {

	ArrayList<AnalysisVO> analysisList();
	ArrayList<AnalysisVO> detailResult(String result_id);
	ArrayList<AnalysisVO> memberAnalysisList(String member_id);
}
