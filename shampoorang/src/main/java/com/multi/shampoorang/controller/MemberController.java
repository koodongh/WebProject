package com.multi.shampoorang.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import com.multi.shampoorang.model.MemberVO;
import com.multi.shampoorang.service.MemberService;


@Controller
public class MemberController {
	
	@Autowired
	MemberService service;
	
	@RequestMapping("/loginCheck")
	public String loginCheck(@RequestParam("member_id") String member_id, @RequestParam("member_pw") String member_pw, HttpSession session) throws Exception{
		MemberVO vo = service.loginCheck(member_id, member_pw);
		
		if(session.getAttribute("login")!=null) {
			session.removeAttribute("login");
		}
		
		
		if (vo != null) {
			session.setAttribute("sid", vo.getMember_id());
			session.setAttribute("sNick", vo.getMember_nickname());
			session.setAttribute("msg", "샴푸랑에 오신걸환영합니다.");

			return "redirect:/mypage/main";

		}
		else {
			session.setAttribute("msg", "회원정보가 맞지 않습니다. 다시한번 시도해주세요.");
			return "redirect:/home/login";
		}
	}
	// 로그 아웃
	
	@RequestMapping("/logout")
	public String userLogout(HttpSession session) {
		// 로그 아웃
		session.invalidate();
//		logger.info("ByeBye Logout success");
		return "redirect:/";
	}

	// 회원 가입 폼으로 이동
	// 값이 있으면 확인해라고 하기
	@RequestMapping("/join")
	public String join(MemberVO mem, HttpSession session) {
		session.setAttribute("sNick", mem.getMember_nickname());
		service.join(mem);
		
		return "redirect:/mypage/main";
	}

		  
	 @RequestMapping("idCheck") 
	 public MemberVO idCheck(@RequestParam("member_id") String member_id)  {
		return service.idCheck(member_id); 
	}
	 

}