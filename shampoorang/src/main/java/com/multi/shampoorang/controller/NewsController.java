package com.multi.shampoorang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NewsController {
	@RequestMapping("/news")
	public String home() {
		return "news/news";
	}
}
