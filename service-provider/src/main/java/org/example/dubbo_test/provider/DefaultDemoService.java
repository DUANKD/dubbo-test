package org.example.dubbo_test.provider;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.dubbo_test.api.DemoService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author duankd
 * @ClassName org.example.dubbo_test.provider.DefaultDemoService
 * @date 2021-06-23 10:03:38
 */
@Service
@DubboService(version = "1.0.0")
public class DefaultDemoService implements DemoService {

    /**
     * The default value of ${dubbo.application.name} is ${spring.application.name}
     */
    @Value("${dubbo.application.name}")
    private String serviceName;

    @Override
    public String sayHello(String name) {
        return String.format("[%s] : Hello, %s", serviceName, name);
    }
}
