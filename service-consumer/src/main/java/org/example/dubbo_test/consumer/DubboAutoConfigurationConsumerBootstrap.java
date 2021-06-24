package org.example.dubbo_test.consumer;

import org.apache.dubbo.config.annotation.DubboReference;
import org.example.dubbo_test.api.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author duankd
 * @ClassName DubboAutoConfigurationConsumerBootstrap
 * @date 2021-06-23 11:27:20
 */
@SpringBootApplication
public class DubboAutoConfigurationConsumerBootstrap {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @DubboReference(version = "1.0.0", url = "dubbo://127.0.0.1:12345")
    private DemoService demoService;

    public static void main(String[] args) {
        SpringApplication.run(DubboAutoConfigurationConsumerBootstrap.class).close();
    }

    @Bean
    public ApplicationRunner runner() {
        return args -> {
            logger.info(demoService.sayHello("mercyblitz"));
        };
    }
}
