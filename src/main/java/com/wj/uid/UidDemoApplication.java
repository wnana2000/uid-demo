package com.wj.uid;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wj.uid.mapper")
public class UidDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(UidDemoApplication.class, args);
    }

}
