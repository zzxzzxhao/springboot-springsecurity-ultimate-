package com.deceen.demo.controller;

import com.deceen.demo.entity.DemoEntity;
import com.deceen.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: zzx
 * @date: 2018/10/25 16:48
 * @description: demo
 */
@RestController
@RequestMapping("/test")
public class DemoController {

    @Autowired
    private DemoService orderService;

    @RequestMapping("/getUser")
    public List<DemoEntity> getUser(){
        List<DemoEntity> result = orderService.getUser();
        return result;
    }

}
