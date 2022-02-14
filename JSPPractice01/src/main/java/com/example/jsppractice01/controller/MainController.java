package com.example.jsppractice01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    // Fault in the location of storing jsp
    @RequestMapping("index")

    public String indexController()
    {
        return "index.jsp";
    }

}
