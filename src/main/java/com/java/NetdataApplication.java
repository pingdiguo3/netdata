package com.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class NetdataApplication {

    public static void main(String[] args) {
        SpringApplication.run(NetdataApplication.class, args);
    }

}
