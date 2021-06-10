package com.multi.shampoorang.service;

import com.multi.shampoorang.model.MemberVO;

public interface IMemberService {

		MemberVO loginCheck(String member_id, String member_pw);
		MemberVO idCheck(String member_id);
		void join(MemberVO mem);

//		int idCheck(String member_id);
	}
