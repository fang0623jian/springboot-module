package com.example.module;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SprinBootExampleApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(SprinBootExampleApplication.class, args);

//		KafkaSender sender = context.getBean(KafkaSender.class);
//
//		for (int i = 0; i < 3; i++) {
//			//调用消息发送类中的消息发送方法
//			sender.send();
//
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
	}

}
