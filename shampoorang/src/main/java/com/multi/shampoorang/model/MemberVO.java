package com.multi.shampoorang.model;

import java.util.Date;

public class MemberVO {
	private String member_id;
	private String member_pw;
	private String member_nickname;
	private String member_result_list;
	private Date joinDate;
	
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getMember_pw() {
		return member_pw;
	}
	public void setMember_pw(String member_pw) {
		this.member_pw = member_pw;
	}
	public String getMember_nickname() {
		return member_nickname;
	}
	public void setMember_nickname(String member_nickname) {
		this.member_nickname = member_nickname;
	}
	public String getMember_result_list() {
		return member_result_list;
	}
	public void setMember_result_list(String member_result_list) {
		this.member_result_list = member_result_list;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	

}