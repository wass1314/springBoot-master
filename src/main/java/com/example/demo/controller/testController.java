package com.example.demo.controller;

import com.example.demo.service.testService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/testController")
public class testController {


    @Autowired
    testService testService;



    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return testService.test().toString();
    }
}
