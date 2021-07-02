package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class TestController {
   @RequestMapping("/h1")
   //代表admin文件夹之下的test.jsp
   public String test(){
       return "test";
  }
}
