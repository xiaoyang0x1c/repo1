package com.lagou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xiaoyang
 * @date 2023/4/17
 * @program springmvc
 */
@Controller
public class ExceptionController {
    @RequestMapping("/error")
    public String error(){
        int a = 1/0;
        return "success";
    }
}
