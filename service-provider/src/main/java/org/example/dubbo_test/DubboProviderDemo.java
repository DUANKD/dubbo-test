package org.example.dubbo_test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author duankd
 * @ClassName org.example.dubbo_test.DubboProviderDemo
 * @date 2021-06-23 10:08:36
 */
//@EnableAutoConfiguration
@SpringBootApplication
@MapperScan("org.example.dubbo_test.api")
public class DubboProviderDemo {

    public static void main(String[] args) {
        SpringApplication.run(DubboProviderDemo.class,args);
    }
}
