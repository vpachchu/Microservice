package com.example.requestmapping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping(value = "/hi")
    public String commonMethod()
    {
        return "Hi, I can be run in both get and post";
    }
    @RequestMapping(value = "/hi",method = RequestMethod.POST)
    public String postMethod()
    {
      return "Hi, I can be run only in post";
    }

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String getMethod()
    {
        return  "Hi, I can be run only in get";
    }
}