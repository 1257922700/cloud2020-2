package com.guigu.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@MapperScan({"com.guigu.springcloud.dao"})
public class MyBatisConfig {

}
