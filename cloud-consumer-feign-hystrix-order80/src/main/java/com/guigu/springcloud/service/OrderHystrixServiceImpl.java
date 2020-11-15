package com.guigu.springcloud.service;
import org.springframework.stereotype.Component;

@Component
public class OrderHystrixServiceImpl implements OrderHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "pay80,错误返回。。。";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "pay80,超时方法错误返回！";
    }
}
