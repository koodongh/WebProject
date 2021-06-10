package com.multi.shampoorang.dao;

import java.util.HashMap;

import com.multi.shampoorang.model.MemberVO;

public interface IMemberDAO {

	 MemberVO loginCheck(HashMap<String, String> map);
	 MemberVO idCheck(String member_id);
	 void join(MemberVO mem);
}
