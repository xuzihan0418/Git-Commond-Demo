package com.cattywhale.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GitController {

    @RequestMapping("/login")
    public String login() {
        return "redirect:http://www.baidu.com";
    }
}
