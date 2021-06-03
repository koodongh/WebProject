package com.multi.shampoorang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TilesController {	
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        return "home/home";
    }
    
    // DB 테스트용 화면    
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "index";
    }
}
