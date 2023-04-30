package com.lagou.controller;

import com.lagou.pojo.QueryVo;
import com.lagou.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author xiaoyang
 * @date 2023/4/6
 * @program springmvc
 */
@RequestMapping(path = {"/user"})
@Controller
@SessionAttributes("username")
public class UserController {
    @RequestMapping("/quick")
    public String quick() {
        //业务逻辑
        System.out.println("springMVC入门成功");
        //视图跳转
        //return "/WEB-INF/pages/success.jsp";
        return "success";
    }

    @RequestMapping(path = {"/simpleParam"}, params = {"id", "username"})
    public String simpleParam(int id, String username) {
        System.out.println(id);
        System.out.println(username);
        return "success";
    }

    @RequestMapping("/pojoParam")
    public String pojoParam(User user) {
        System.out.println(user.getId());
        System.out.println(user.getUsername());
        return "success";
    }

    @RequestMapping("/arrayParam")
    public String arrayParam(int[] ids) {
        System.out.println(Arrays.toString(ids));
        return "success";
    }

    @RequestMapping("/queryParam")
    public String queryParam(QueryVo queryVo) {
        System.out.println(queryVo);
        return "success";
    }

    @RequestMapping("/converterParam")
    public String converterParam(Date birthday) {
        System.out.println(birthday);
        return "success";
    }

    @RequestMapping("/findByPage")
    public String findByPage(@RequestParam(name = "pageNo") Integer pageNum, @RequestParam(defaultValue = "5") Integer pageSize) {
        System.out.println(pageNum);
        System.out.println(pageSize);
        return "success";
    }

    /*@RequestMapping("/requestHeader")
    public String requestHeader(@RequestHeader("cookie") String cookie){
        System.out.println(cookie);
        return "success";
    }*/
    @RequestMapping("/cookieValue")
    public String requestHeader(@CookieValue("JSESSIONID") String jsessionid) {
        System.out.println(jsessionid);
        return "success";
    }
    @RequestMapping("/servletAPI")
    public String servletAPI(HttpServletRequest request, HttpServletResponse response, HttpSession session){
        System.out.println(request);
        System.out.println(response);
        System.out.println(session);
        return "success";
    }
    @RequestMapping("/returnVoid")
    public void returnVoid(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
        //1.通过response直接响应数据
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write("你好springMVC");
        //2.转发
        request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request,response);
        //3.重定向
        //response.sendRedirect(request.getContextPath()+"/index.jsp");
    }
    @RequestMapping("/forward")
    public String forward(Model model){
        model.addAttribute("username","lg");
        return "forward:/WEB-INF/pages/success.jsp";
    }
    @RequestMapping("/redirect")
    public String redirect(Model model){
        model.addAttribute("id","1");
        return "redirect:/index.jsp";
    }
    @RequestMapping("/returnModelAndView1")
    public ModelAndView returnModelAndView1(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("username","zhangfei");
        modelAndView.setViewName("success");
        return modelAndView;
    }
    @RequestMapping("/returnModelAndView2")
    public ModelAndView returnModelAndView2(ModelAndView modelAndView){
        modelAndView.addObject("username","张飞");
        modelAndView.setViewName("success");
        return modelAndView;
    }
    @RequestMapping("/ajaxRequest")
    @ResponseBody
    public List<User> ajaxRequest(@RequestBody List<User> list){
        System.out.println(list);
        return list;
    }
}