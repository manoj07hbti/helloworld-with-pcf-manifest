package com.config;

import com.Database.Database;
import com.Service.service;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.xml.ws.Service;
@Component
public class Config {
    @Bean
    public service method(){

        return new service();
    }
    @Bean
    public Database method2(){
        return new Database();
    }



}
