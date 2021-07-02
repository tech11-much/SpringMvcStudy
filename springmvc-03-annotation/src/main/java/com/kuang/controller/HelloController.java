package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//定义了访问的路径，第一级路径
@RequestMapping("hello")
public class HelloController {
    //第二级路径
    @RequestMapping("h1")
    public String hello(Model model){
        model.addAttribute("msg", "Hello, springMvcAnnotation");
        //返回视图的名字，即jsp的名字
        return "hello";
    }
}
