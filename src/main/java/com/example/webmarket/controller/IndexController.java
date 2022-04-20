package com.example.webmarket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/HelloJSP")
    public String index() {
        return "forward:/index.jsp";
    }

    @RequestMapping("/hellojsp2")
    public String hello2() {
        return "hello2";
    }
}
