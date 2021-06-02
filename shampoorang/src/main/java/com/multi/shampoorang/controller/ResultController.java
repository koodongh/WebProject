package com.multi.shampoorang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ResultController {
	
	@RequestMapping("result/result")
	public String allResult() {
		return "result/result";
	}
	
	@RequestMapping("result/badResult")
	public String badResult() {
		return "result/badResult";
	}
	
	@RequestMapping(value="result/goodResult")
	public String goodResult() {
		return "result/goodResult";
	}
	
}
