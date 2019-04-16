package com.example.demo.service.impl;

import com.example.demo.dao.UserMapper;
import com.example.demo.entry.User;
import com.example.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("loginService")
public class LoginServiceImpl implements LoginService {

    @Autowired
    UserMapper userMapper;
    public User Login(String userName,String password){

        return userMapper.Login(userName,password);
    }
}
