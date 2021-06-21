package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

/**
 * @author daixiongxing
 * @since 2021-06-21 下午9:06
 */

//在templates目录下面，只能通过Controller来访问
    //需要模板引擎支持 thymelaf
@Controller
public class IndexController {

    @RequestMapping("/test")
    public String test(Model model){
        model.addAttribute("msg","<h1>hello springboot</h1>");
        model.addAttribute("users", Arrays.asList("jiangmao","xiaohei"));
        return "test";
    }
}
