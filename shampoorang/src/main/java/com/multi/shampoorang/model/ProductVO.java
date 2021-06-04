package com.multi.shampoorang.model;

public class ProductVO {
	private String ingd_name;
	private String ewg;
	private int hazzard;
	private String description;
	private int ewg_encode;
	
	public String getingd_name() {
		return ingd_name;
	}
	public void setingd_name(String ingd_name) {
		this.ingd_name = ingd_name;
	}
	public String getewg() {
		return ewg;
	}
	public void setewg(String ewg) {
		this.ewg = ewg;
	}
	public int gethazzard() {
		return hazzard;
	}
	public void sethazzard(int hazzard) {
		this.hazzard = hazzard;
	}

	public String getdescription() {
		return description;
	}
	public void setdescription(String description) {
		this.description = description;
	}
	public int getewg_encode() {
		return ewg_encode;
	}
	public void setewg_encode(int ewg_encode) {
		this.ewg_encode = ewg_encode;
	}
}
