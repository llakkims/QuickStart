package com.cap.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
	
	public static void main(String arg[])
	{
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");
		
		Communication app= (Communication) context.getBean("communication");
		app.communicate();
	}

}
