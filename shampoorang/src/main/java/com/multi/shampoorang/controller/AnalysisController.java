
package com.multi.shampoorang.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.shampoorang.model.AnalysisVO;
import com.multi.shampoorang.model.OcrJoinVO;
import com.multi.shampoorang.service.AnalysisService;
import com.multi.shampoorang.service.ProductService;

@Controller
public class AnalysisController {

	@Autowired
	AnalysisService analysisService;

	@Autowired
	ProductService productService;

	@RequestMapping("/result/analysisView")
	public String viewAnalysisList(Model model) {

		ArrayList<AnalysisVO> analysisList = analysisService.analysisList();
		model.addAttribute("analysisList", analysisList);

		return "/result/analysisView";
	}

	@RequestMapping("/result/ocr")
	public String Ocr(AnalysisVO ocr, HttpSession session) {

		String sid = (String) session.getAttribute("sid");
		ocr.setMember_id(sid);
		
		analysisService.Ocr(ocr);

		return "redirect:/ocr_join_list";
	}

	@RequestMapping("/ocr_join_list")
	public String ocr_join_list(Model model, HttpSession session) {
		
		  String sid = (String) session.getAttribute("sid");
		  
			/*
			 * ArrayList<OcrJoinVO> vo = analysisService.ocrJoinList(sid);
			 * 
			 * String rRe = vo.get(1).getResult_id(); System.out.println(rRe);
			 * 
			 * session.setAttribute("rRe", rRe);
			 * 
			 * String key = (String) session.getAttribute("rRe");
			 */

		  ArrayList<OcrJoinVO> ocrJoinList = analysisService.ocrJoinList(sid);
		  		  		 	
		  
		  model.addAttribute("ocrJoinList", ocrJoinList);
		
		  
		  
		return "/result/analysisView";
	}

	@RequestMapping("/mypage/resultList/{member_id}/{result_id}")
	public String mypageDetailResult(@PathVariable String member_id, @PathVariable String result_id, Model model) {

		ArrayList<AnalysisVO> detailResult = analysisService.detailResult(result_id);
		model.addAttribute("detailResult", detailResult);

		return "/result/resultDetailView";
	}
}

/*
 * 
 * for(int i=0; i < ocrJoinList.size(); i++) {
 * System.out.print(ocrJoinList.get(i).getResult_id());
 * System.out.print(ocrJoinList.get(i).getMember_id());
 * System.out.print(ocrJoinList.get(i).getIngd_name());
 * System.out.print(ocrJoinList.get(i).getEwg());
 * System.out.print(ocrJoinList.get(i).getHazzard());
 * System.out.print(ocrJoinList.get(i).getDescription());
 * System.out.print(ocrJoinList.get(i).getEwg_encode()); System.out.println(); }
 * 
 */