package com.multi.shampoorang.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.multi.shampoorang.model.ProductVO;
import com.multi.shampoorang.service.ProductService;

@Controller
public class TilesController {
	
	@Autowired
	ProductService service;
	
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        return "home/home";
    }
    
    // DB 테스트용 화면    
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "index";
    }
    
	@RequestMapping("/ingd/ingdListView")
	public String viewProductList(Model model) {		
		
		ArrayList<ProductVO> ingdList = service.ingdList();
		model.addAttribute("ingdList", ingdList);
		 
		return "/jsp/view/ingd/ingdListView"; 
	}
}
