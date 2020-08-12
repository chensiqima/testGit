package org.boggler.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ComponentScan(basePackages = {"org.boggler"})
@EnableScheduling
@MapperScan(basePackages = "org.boggler.api.mappers")
public class BogglerapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(BogglerapiApplication.class, args);
    }

}
