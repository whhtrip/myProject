package com.dynamicdatasource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages = {"com.whh","com.dynamicdatasource"})
/**
 * @EnableTransactionManagement 事务生效注解在这不使用事务也生效
 */
@EnableTransactionManagement
@ComponentScan("com.whh.dao")
public class D1Application {

    public static void main(String[] args) {
        SpringApplication.run(D1Application.class, args);
    }

}
