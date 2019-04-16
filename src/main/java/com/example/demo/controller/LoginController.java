package com.example.demo.controller;

import com.example.demo.entry.User;
import com.example.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @Autowired
    LoginService loginService;

    @RequestMapping("/login")
    @ResponseBody
    public String login(String username,String password){

       User u =  loginService.Login(username,password);
       if(u!=null){
           return "index";
       }else{
           return "login";
       }
    }
}

