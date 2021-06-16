package com.multi.shampoorang.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
 
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.*;
import java.text.*;


@Controller
public class CrawlingController {
 
    public static HashMap<String, String> map;
 
    @RequestMapping(value = "/news", method = RequestMethod.GET)
    public String startCrawl(Model model) throws IOException {
 
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MM.dd", Locale.KOREA);
        Date currentTime = new Date();
 
        String dTime = formatter.format(currentTime);
        String e_date = dTime;
 
        currentTime.setDate(currentTime.getDate() - 1);
        String s_date = formatter.format(currentTime);
 
        String query = "유해성분";
        String s_from = s_date.replace(".", "");
        String e_to = e_date.replace(".", "");
        int page = 1;
        ArrayList<String> al1 = new ArrayList<>();
        ArrayList<String> al2 = new ArrayList<>();
        ArrayList<String> al3 = new ArrayList<>();
        
        while (page < 25) {
        	
        	String address = "https://search.naver.com/search.naver?where=news&sm=tab_pge&query=" + query + "&sort=0photo=0&field=0&pd=0&ds=" + s_date
                    + "&de=" + e_date + "cluster_rank=85&mynews=0&office_type=0&office_section_code=0&news_office_checked=&nso=so:r,p:all,a:all&start="
                    + Integer.toString(page);
            Document rawData = Jsoup.connect(address).timeout(0).get();
    		System.out.println(address);
            Elements articles = rawData.select("div.news_wrap");
            String realURL = "";
            String realTITLE = "";
            String realTIME = "";
            
            for (Element option : articles) {
                realURL = option.select("div.news_area > a").attr("href");
                al1.add(realURL);
                realTITLE = option.select(".news_tit").attr("title");
                al2.add(realTITLE);
                      
                System.out.println(realURL);
                System.out.println(realTITLE);
            }         
            page += 10;     
        }
        model.addAttribute("urls", al1);
        model.addAttribute("titles", al2);

        return "news/news";
    }
}





