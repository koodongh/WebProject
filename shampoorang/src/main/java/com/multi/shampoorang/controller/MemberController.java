package com.multi.shampoorang.controller;

import javax.servlet.http.HttpSession;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;

import com.multi.shampoorang.service.MemberService;
import com.multi.shampoorang.model.MemberVO;


@Controller
public class MemberController {
	
	@Autowired
	MemberService service;

	@RequestMapping("/loginCheck")
	public String loginCheck(@RequestParam("member_id") String member_id, @RequestParam("member_pw") String member_pw, HttpSession session) {
		MemberVO vo = service.loginCheck(member_id, member_pw);
		if (vo != null) {
			session.setAttribute("sid", vo.getMember_id());
			session.setAttribute("sNick", vo.getMember_nickname());
		}

		return "redirect:/mypage/main";
	}

	// 로그 아웃
	@RequestMapping("/logout")
	public String userLogout(HttpSession session) {
		// 로그 아웃
		session.invalidate();
		return "redirect:/";
	}

	// 회원 가입 폼으로 이동
	@RequestMapping("/join")
	public String join(MemberVO mem, HttpSession session) {

		service.join(mem);
		return "/mypage/main";
	}

		  
	 @RequestMapping("idCheck") 
	 public MemberVO idCheck(@RequestParam("member_id") String member_id)  {
		return service.idCheck(member_id); 
	}
	 

}