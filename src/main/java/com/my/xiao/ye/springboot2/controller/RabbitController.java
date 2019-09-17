package com.my.xiao.ye.springboot2.controller;


import com.my.xiao.ye.springboot2.service.RabbitServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rabbit")
public class RabbitController {

    @Autowired
   private RabbitServiceI rabbitServiceI;

    @GetMapping("/test")
    public String send(){
        rabbitServiceI.sendMsg();

        return "";
    }


}
