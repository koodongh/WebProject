package com.multi.shampoorang.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.shampoorang.model.DislikeVO;
import com.multi.shampoorang.model.ProductVO;
import com.multi.shampoorang.service.DislikeService;
import com.multi.shampoorang.service.ProductService;

@Controller
public class MypageController {
	@Autowired
	ProductService productService;
	
	@Autowired
	DislikeService dislikeService;
	
	@RequestMapping("/mypage/main")
	public String mypage() {
		return "mypage/main";
	}
	
	@RequestMapping(value="/mypage/dislike/{member_id}")
	public String viewDislikeList(@PathVariable String member_id, Model model) {		
		
		ArrayList<ProductVO> ingdList = productService.ingdList();
		model.addAttribute("ingdList", ingdList);
		
		ArrayList<DislikeVO> dislikeList = dislikeService.dislikeList(member_id);
		model.addAttribute("dislikeList", dislikeList);
		 
		return "mypage/dislikeIngd"; 
	}
	
	@RequestMapping("/mypage/like")
	public String viewLikeList(Model model) {		
		
		ArrayList<ProductVO> ingdList = productService.ingdList();
		model.addAttribute("ingdList", ingdList);
		 
		return "mypage/likeIngd"; 
	}
	
	@RequestMapping("/mypage/resultList")
	public String mypageResultList() {
		return "mypage/resultList";
	}
	
	@RequestMapping("/mypage/insertDislikeIngd")
	public String insertDislikeIngd(DislikeVO dislike) {
		
		dislikeService.insertDislike(dislike);
		return "redirect:/mypage/dislike";
	}
}