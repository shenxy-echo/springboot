package com.shenxy.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * created by 沈小云 on 2018/9/12  15:27
 */
@Controller
@RequestMapping("page")
public class PageController {
    @RequestMapping("{pageName}")
    public String page(@PathVariable("pageName")String pageName){
        return pageName;
    }
}
