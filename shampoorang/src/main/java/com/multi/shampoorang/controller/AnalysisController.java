/*아직 수정 필요합니당*/
package com.multi.shampoorang.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.shampoorang.model.AnalysisVO;
import com.multi.shampoorang.service.AnalysisService;

@Controller
public class AnalysisController {
   
	@Autowired
	AnalysisService service;
	
    @RequestMapping("/result/analysisView")
    public String viewAnalysisList(Model model) {

    ArrayList<AnalysisVO> analysisList = service.analysisList();
	model.addAttribute("analysisList", analysisList);
		 
	return "/result/analysisView"; 
	}
    
    @RequestMapping("/result/ocr")
	public String Ocr(AnalysisVO ocr, HttpSession session) {

		((AnalysisService) service).Ocr(ocr);
		return "redirect:/result/analysisView";
	}
    
	@RequestMapping("/mypage/resultList/{member_id}/{result_id}")
	public String viewDetailResult() {
	return "/result/analysisView";	
	}
}