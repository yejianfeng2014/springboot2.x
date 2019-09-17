package com.my.xiao.ye.springboot2;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class TestRabbit {


    //定义队列名
    static String QUEUE_NAME = "helloRabbit";

    public static void main(String[] args) {

        ConnectionFactory factory = new ConnectionFactory();


        factory.setHost("localhost");
        Connection connection = null;
        Channel channel = null;


        //1.创建连接和通道

        try {
            connection = factory.newConnection();
            channel = connection.createChannel();

            //2.为通道声明队列
            channel.queueDeclare(QUEUE_NAME, false, false, false, null);

//3.发布消息
            String msg = " hello rabbitmq, welcome to sam's blog.";
            channel.basicPublish("", QUEUE_NAME, null, msg.getBytes());
            System.out.println("provider send a msg: " + msg);


        } catch (IOException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }finally {


            //4.关闭连接
            if (channel != null) {
                try {
                    channel.close();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (TimeoutException e) {
                    e.printStackTrace();
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }


    }
}
