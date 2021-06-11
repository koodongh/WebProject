/*아직 수정 필요합니당*/
package com.multi.shampoorang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AnalysisController {
   
//    @Autowired
//    private AnalysisService a;
//   
    @RequestMapping(value="/Analysis")
    public String Analysis() {
        return "Analysis";
        }
}