package com.example.dubboconsumer;

import com.example.dubboconsumer.Annotation.ConsumerAnnotationService;
import com.example.dubboconsumer.Configuration.ConsumerConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class AppAnnotation {
    public static void main( String[] args ) throws IOException {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConsumerConfiguration.class);
        context.start(); // 启动
        ConsumerAnnotationService consumerAnnotationService = context.getBean(ConsumerAnnotationService.class);
        String hello = consumerAnnotationService.doSayHello("annotation"); // 调用方法
        System.out.println("result: " + hello); // 输出结果

    }
}
