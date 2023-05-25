package com.example.dynamicHikaricp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Karl
 */
@SpringBootApplication
@MapperScan(basePackages = "com.example.dynamicHikaricp.mapper")
public class DynamicDataSourceUseHikariCpApplication {

    public static void main(String[] args) {
        SpringApplication.run(DynamicDataSourceUseHikariCpApplication.class, args);
    }

}
