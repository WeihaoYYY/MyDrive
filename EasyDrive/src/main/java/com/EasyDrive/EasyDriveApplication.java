package com.EasyDrive;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages = {"com.EasyDrive"})
@EnableTransactionManagement  //
@EnableScheduling  //定时任务 Scheduled tasks
@EnableAsync  //异步调用，用于上传大文件 Async tasks, for uploading files
@MapperScan(basePackages = {"com.EasyDrive.mappers"})
public class EasyDriveApplication {
    public static void main(String[] args) {
        SpringApplication.run(EasyDriveApplication.class, args);
    }
}
