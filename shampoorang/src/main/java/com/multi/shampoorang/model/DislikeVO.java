package com.multi.shampoorang.model;

public class DislikeVO {
	private String dislikes_id;
	private String member_id;
	private String ingd_name;

	public String getDislikes_id() {
		return dislikes_id;
	}
	public void setDislikes_id(String dislikes_id) {
		this.dislikes_id = dislikes_id;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getIngd_name() {
		return ingd_name;
	}
	public void setIngd_name(String ingd_name) {
		this.ingd_name = ingd_name;
	}
	@Override
	public String toString() {
		return "DislikeVO [dislike_id=" + dislikes_id + ", member_id=" + member_id + ", ingd_name=" + ingd_name + "]";
	}
	
}
