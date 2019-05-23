package com.nw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@Configuration
@PropertySource({"classpath:db.properties"})
public class ServerBootStrap {

    public static void main(String[] args) {
        SpringApplication.run(ServerBootStrap.class, args);
    }

}
