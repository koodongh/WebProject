package com.multi.shampoorang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("")
	public String home() {
		return "home/home";
	}
	
	@RequestMapping("home/login")
	public String login() {
		return "home/login";
	}
	
	@RequestMapping("home/register")
	public String register() {
		return "home/register";
	}
	
}
