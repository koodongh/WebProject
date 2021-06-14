package com.multi.shampoorang.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.shampoorang.model.AnalysisVO;
import com.multi.shampoorang.model.DislikeVO;
import com.multi.shampoorang.model.ProductVO;
import com.multi.shampoorang.service.AnalysisService;
import com.multi.shampoorang.service.DislikeService;
import com.multi.shampoorang.service.MemberService;
import com.multi.shampoorang.service.ProductService;

@Controller
public class MypageController {
	@Autowired
	AnalysisService analysisService;
	
	@Autowired
	ProductService productService;
	
	@Autowired
	DislikeService dislikeService;

	@Autowired
	MemberService service;
	
	@RequestMapping("/mypage/main")
	public String mypage(HttpSession session) {
		if (session.getAttribute("sNick") != null) {
			return "/mypage/main";
		} else {
			return "/home/home";
		}
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
	
	@RequestMapping("/mypage/resultList/{member_id}")
	public String mypageResultList(Model model) {
		
	    ArrayList<AnalysisVO> memberAnalysisList = analysisService.analysisList();
		model.addAttribute("memberAnalysisList", memberAnalysisList);

		return "mypage/resultList";
	}
	
	@RequestMapping("/mypage/dislike/{member_id}/insertDislikeIngd")
	public String insertDislikeIngd(DislikeVO dislike) {
		System.out.print(dislike.toString());
		dislikeService.insertDislike(dislike);
		return "redirect:/mypage/dislike/{member_id}";
	}
}