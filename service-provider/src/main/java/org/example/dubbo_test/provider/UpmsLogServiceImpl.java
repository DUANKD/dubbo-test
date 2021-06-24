package org.example.dubbo_test.provider;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.dubbo.config.annotation.DubboService;
import org.example.dubbo_test.api.UpmsLog;
import org.example.dubbo_test.api.UpmsLogMapper;
import org.example.dubbo_test.api.UpmsLogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * UpmsLogService实现 Created by shuzheng on 2017/3/20.
 */
@Service
@DubboService(version = "1.0.0")
@Transactional
public class UpmsLogServiceImpl extends ServiceImpl<UpmsLogMapper, UpmsLog> implements UpmsLogService {

    private static final Logger log = LoggerFactory.getLogger(UpmsLogServiceImpl.class);

    @Autowired
    UpmsLogMapper upmsLogMapper;

}