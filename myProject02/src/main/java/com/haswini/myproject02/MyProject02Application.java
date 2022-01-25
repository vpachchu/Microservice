package com.haswini.myproject02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MyProject02Application {

    public static void main(String[] args) {
        SpringApplication.run(MyProject02Application.class, args);
    }

}
