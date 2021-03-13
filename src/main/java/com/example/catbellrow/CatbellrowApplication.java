package com.example.catbellrow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class CatbellrowApplication {

    public static void main(String[] args) {
        SpringApplication.run(CatbellrowApplication.class, args);
    }

}
