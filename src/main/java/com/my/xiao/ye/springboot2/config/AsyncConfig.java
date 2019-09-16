package com.my.xiao.ye.springboot2.config;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@Configuration
@EnableAsync
public class AsyncConfig implements AsyncConfigurer {


    @Override
    public Executor getAsyncExecutor() {

        // 定义线程池
        ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();

        // 定义核心线程10
        threadPoolTaskExecutor.setCorePoolSize(10);
        // 线程最大线程数
        threadPoolTaskExecutor.setMaxPoolSize(30);
        // 线程队列最大线程数
        threadPoolTaskExecutor.setQueueCapacity(2000);

        threadPoolTaskExecutor.initialize();

        return threadPoolTaskExecutor;
//        return null;
    }


    // 处理出现异常得方法

    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {


        System.out.println("异步执行中遇到错误");
        return null;
    }
}
