package com.multi.shampoorang.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class APIController {

	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	
	/*
	 * @RequestMapping("/clovaOCR") public void clovaOCR() {
	 * ocrService.clovaOCRService(); }
	 */
	
	
}





















