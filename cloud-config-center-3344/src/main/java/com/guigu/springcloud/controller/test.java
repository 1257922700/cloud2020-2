package com.guigu.springcloud.controller;

import com.guigu.springcloud.entities.CommonResult;
import com.guigu.springcloud.entities.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
    @GetMapping(value = "/test/get/{id}")
    public String getPaymentById(@PathVariable("id") Long id){
        return "success";
    }
}
