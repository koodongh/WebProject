package com.multi.shampoorang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MypageController {
	@RequestMapping("mypage/main")
	public String mypage() {
		return "mypage/main";
	}
}
