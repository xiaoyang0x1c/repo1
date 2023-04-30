package com.lagou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xiaoyang
 * @date 2023/4/17
 * @program springmvc
 */
@Controller
public class Target {
    @RequestMapping("/target")
    public String target(){
        System.out.println(" 目标方法执行了...");
        return "success";
    }
}
