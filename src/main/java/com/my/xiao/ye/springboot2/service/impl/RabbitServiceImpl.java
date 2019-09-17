package com.my.xiao.ye.springboot2.service.impl;

import com.my.xiao.ye.springboot2.service.RabbitServiceI;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RabbitServiceImpl implements RabbitServiceI {


    @Autowired
    AmqpTemplate rabbitmqTemplate;
    @Override
    public void sendMsg() {

        String content = "Sender says:" + "'hello， I'm sender'";
        System.out.println(content);
        rabbitmqTemplate.convertAndSend("hello", content);


    }
}
