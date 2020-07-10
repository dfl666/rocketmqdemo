package com.dongfl.rocketmqdemo.controller;

import com.dongfl.rocketmqdemo.service.RocketMQConsumer;
import com.dongfl.rocketmqdemo.service.RocketMQProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    RocketMQProvider rocketMQProvider;

    @Autowired
    RocketMQConsumer rocketMQConsumer;


    @RequestMapping("/testProducer")
    public String testProducer() {
        rocketMQProvider.defaultMQProducer();
        return null;
    }

    @RequestMapping("/testConsumer")
    public String testConsumer() {
        rocketMQConsumer.defaultMQPushConsumer();
        return null;
    }
}
