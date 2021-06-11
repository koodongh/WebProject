package com.multi.shampoorang.dao;

import java.util.HashMap;

import com.multi.shampoorang.model.AnalysisVO;

public interface IAnalysisDAO {

	 AnalysisVO AnalysisCheck(HashMap<String, String> map);
	 void join(AnalysisVO mem);
}
