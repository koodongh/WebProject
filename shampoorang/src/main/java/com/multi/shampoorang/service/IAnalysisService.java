package com.multi.shampoorang.service;

import com.multi.shampoorang.model.AnalysisVO;

public interface IAnalysisService {

		AnalysisVO AnalysisCheck(String ocr_text);
		void join(AnalysisVO ana);

	}
