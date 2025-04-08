package com.souptik.Bookstore_Application_Zynetic.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/hello")
    public String helloWorld(){
        return "Hello World";
    }
}
