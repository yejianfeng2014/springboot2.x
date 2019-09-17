package com.my.xiao.ye.springboot2.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 *  定时消息
 *
 */
//@Component
//@Configuration // 1,标记为配置文件，
//@EnableScheduling // 2,开启定时任务 ,把这个注释掉也可跑起来？？？？？？？？？？？
public class SaticScheduleTask {

    // 添加定时任务
    @Scheduled(cron = "0/5 * * * * ?")
    // 或者直接指定间隔
//    @Scheduled(fixedRate=5000)
    private void configureTasks() {
        System.err.println("执行静态定时任务时间: " + LocalDateTime.now());
    }
}
