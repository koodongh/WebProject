package com.multi.shampoorang.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.multi.shampoorang.dao.IMemberDAO;
import com.multi.shampoorang.model.MemberVO;

@Service
public class MemberService implements IMemberService {

	@Autowired
	@Qualifier("IMemberDAO")
	IMemberDAO dao;

	@Override
	public MemberVO loginCheck(String member_id, String member_pw) {

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("member_id", member_id);
		map.put("member_pw", member_pw);
		return dao.loginCheck(map);
	}
	
	
	@Override 
	public MemberVO idCheck(String member_id) { 
		return dao.idCheck(member_id); 
		}
	
	@Override	 
	public void join(MemberVO mem) {
		dao.join(mem);
	}
		/*
		 * @Override public int idCheck(String member_id) { return
		 * dao.idCheck(member_id); }
		 */

}
