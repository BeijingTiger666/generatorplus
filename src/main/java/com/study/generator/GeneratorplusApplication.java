package com.study.generator;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.study.generator.dao")
public class GeneratorplusApplication {

    public static void main(String[] args) {
        SpringApplication. run(GeneratorplusApplication.class,args);
    }
}
