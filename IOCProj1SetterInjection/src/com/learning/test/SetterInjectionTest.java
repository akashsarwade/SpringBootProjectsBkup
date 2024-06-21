package com.learning.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.learning.beans.WishMsgGenerator;

public class SetterInjectionTest {

	// locate and hold spring bean config file

	FileSystemResource file = new FileSystemResource("src/com/learning/config/applicationContext.xml");

	// Create IOC Container

	ApplicationContext context = new ClassPathXmlApplicationContext((ApplicationContext) file);

	Object obj = context.getBean("wmg");

	WishMsgGenerator generator = (WishMsgGenerator) obj;
	String res = generator.generateWishMsg("Akash");
}
