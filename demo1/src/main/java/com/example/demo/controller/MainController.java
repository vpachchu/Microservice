package com.example.demo.controller;

import com.example.demo.model.Bouquet;
import com.example.demo.service.BouquetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    BouquetService bouquetService;

    @RequestMapping(name="/bouquet",method = RequestMethod.POST)
    public Bouquet save (@RequestBody Bouquet bouquet)
    {

        return bouquetService.save(bouquet);
    }
}
