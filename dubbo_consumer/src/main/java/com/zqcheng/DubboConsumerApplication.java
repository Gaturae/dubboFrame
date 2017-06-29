package com.zqcheng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@SpringBootApplication
@ImportResource("classpath:consumer.xml")
public class DubboConsumerApplication{

	public static void main(String[] args) {
		SpringApplication.run(DubboConsumerApplication.class, args);
		/*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "consumer.xml" });
        context.start();
        TestService testService = (TestService) context.getBean("testService");*/
        log.info("消费者绑定成功!");
//        log.info(testService.sayHello());
	}

}
