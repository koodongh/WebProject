package com.multi.shampoorang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ResultController {
	
	@RequestMapping(value="result/ocrResult")
	public String ocrResult() {
		return "result/ocrResult";
	}
	
	
}
