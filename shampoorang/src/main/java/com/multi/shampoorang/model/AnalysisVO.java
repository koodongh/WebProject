package com.multi.shampoorang.model;

public class AnalysisVO {
	private String Result_id;
	private String member_id;
	private String ocr_text;
	
	public String getResult_id() {
		return Result_id;
	}
	public void setResult_id(String result_id) {
		this.Result_id = result_id;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getOcr_text() {
		return ocr_text;
	}
	public void setOcr_text(String ocr_text) {
		this.ocr_text = ocr_text;
	}

}