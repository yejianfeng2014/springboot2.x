package com.my.xiao.ye.springboot2.service.impl;

import com.my.xiao.ye.springboot2.service.AsyncService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncServiceImpl implements AsyncService {


    @Override
    @Async
    public void generateReport() {

        // 打印异步线程名称

        try {
            for (int i = 0; i <1000 ; i++) {

                Thread.sleep(20); //睡眠20 毫秒，正式环境可以去掉
//   测试异步处理过程中出现得错误
//                if (i==200){
//
//                    int s= 2/0;
//                    System.out.println(s);
//                }
                System.out.println("报表名称：" + Thread.currentThread().getName());

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("调用线程结束");
    }
}
