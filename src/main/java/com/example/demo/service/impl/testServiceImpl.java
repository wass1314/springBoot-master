package com.example.demo.service.impl;

import com.example.demo.dao.testMapper;
import com.example.demo.service.testService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("testService")
public class testServiceImpl implements testService {
    @Autowired
    testMapper testMapper;
    @Override
    public Map test() {
       return  testMapper.test();
    }
}
