package com.springCore;

import org.springframework.beans.factory.annotation.Autowired;

public class test {
  @Autowired
    private AppName appName;

     public void testing()
     {
         appName.print();
     }
}
