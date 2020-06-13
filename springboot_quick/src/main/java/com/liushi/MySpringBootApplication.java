package com.liushi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName MySpringBootApplication
 * @Description 入门案例
 * @Author liushi
 * @Date 2020/6/11 18:46
 * @Version V1.0
 **/
//声明该类是一个SpringBoot引导类
@SpringBootApplication
public class MySpringBootApplication {

    //main方法是java程序入口
    public static void main(String[] args) {
        //run方法,表示要运行SpringBoot的引导类 run参数就是SpringBoot引导类的字节码对象
        SpringApplication.run(MySpringBootApplication.class);
    }
}
