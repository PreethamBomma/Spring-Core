package com.springCore;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppName {

     @Bean
     public String print() {
        System.out.println("testing");
        return "testing";

    }
}
