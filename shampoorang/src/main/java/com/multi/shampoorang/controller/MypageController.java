package com.multi.shampoorang.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.shampoorang.model.ProductVO;
import com.multi.shampoorang.service.ProductService;

@Controller
public class MypageController {
	@Autowired
	ProductService service;
	
	@RequestMapping("/mypage/main")
	public String mypage() {
		return "mypage/main";
	}
	
	@RequestMapping("/mypage/like")
	public String mypageLike() {
		return "mypage/likeIngd";
	}
	
	@RequestMapping("/mypage/dislike")
	public String viewProductList(Model model) {		
		
		ArrayList<ProductVO> ingdList = service.ingdList();
		model.addAttribute("ingdList", ingdList);
		 
		return "mypage/dislikeIngd"; 
	}
	
	@RequestMapping("/mypage/resultList")
	public String mypageResultList() {
		return "mypage/resultList";
	}
}