package com.multi.shampoorang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MypageController {
	@RequestMapping("mypage/main")
	public String mypage() {
		return "mypage/main";
	}
	
	@RequestMapping("mypage/like")
	public String mypageLike() {
		return "mypage/likeIngd";
	}
	
	@RequestMapping("mypage/dislike")
	public String mypageDislike() {
		return "mypage/dislikeIngd";
	}
	
	@RequestMapping("mypage/resultList")
	public String mypageResultList() {
		return "mypage/resultList";
	}
}