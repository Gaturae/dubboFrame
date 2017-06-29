package com.zqcheng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:provider.xml")
public class ProviderApplication{

	public static void main(String[] args) {
		SpringApplication.run(ProviderApplication.class, args);
		 /*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(    
	                new String[]{"provider.xml"});    
	        context.start();*/  
	        System.out.println("提供者服务已注册成功******111"); 
	}
}
