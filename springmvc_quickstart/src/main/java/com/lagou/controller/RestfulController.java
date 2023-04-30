package com.lagou.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author xiaoyang
 * @date 2023/4/14
 * @program springmvc
 */
@RestController //组合主键：组合@Controller + @ResponseBody
@RequestMapping("/restful")
public class RestfulController {
    @GetMapping("/user/{id}/{username}")
    public String get(@PathVariable Integer id,@PathVariable String username){
        return "get:"+id+username;
    }
    @PostMapping("/user")
    public String post(){
        return "post";
    }
    @PutMapping("/user")
    public String put(){
        return "put";
    }
    @DeleteMapping("/user/{id}")
    public String deletet(@PathVariable int id){
        return "delete"+id;
    }
}
