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
    
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String index() {
        return "home/home";
    }
}
