package com.shenxy.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
/*若controller层不在该文件夹下，则需要配置，一般controller层都在application所在包下，或者子包下*/
/*@ComponentScan("com.shenxy.springboot.controller")*/
public class SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }
}
