package com.multi.shampoorang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ResultController {
	@RequestMapping(value="result/goodResult")
	public String goodResult() {
		return "result/goodResult";
	}
	
}
