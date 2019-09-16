package com.my.xiao.ye.springboot2.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/a")
@RestController
public class TestController {


    @RequestMapping ("/b/e/f/e/dsf/ss")
    public Object  ttt(){



        return "fasjdfljlfsdajflww";
    }


    @RequestMapping ("/c")
    public Object  rwer(String abc){


        System.out.println(abc);


        return "sss";
    }
    @RequestMapping("/new/list")
    public  Object fn(){
        return  "{\n" +
                "\t\"a\": 123,\n" +
                "\t\"b\": 1234,\n" +
                "\t\"c\": 12345\n" +
                "}";
    }
    @RequestMapping("/new/list/string")
    public Object fn1(String f1){


        return 123455;

    }

}
