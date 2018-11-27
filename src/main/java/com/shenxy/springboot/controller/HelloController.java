package com.shenxy.springboot.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * created by 沈小云 on 2018/9/11  11:53
 */
@Controller
@EnableAutoConfiguration
public class HelloController {
    @RequestMapping("hello")
    public String index(){
        System.out.println("进入controller");
        return "hello";
    }
}
