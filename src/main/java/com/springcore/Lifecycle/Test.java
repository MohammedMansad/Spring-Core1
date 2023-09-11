package com.springcore.Lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context=new  ClassPathXmlApplicationContext("lifeconfig.xml");
		Samosa temp=(Samosa)context.getBean("s1");
		System.out.println(temp);
		context.registerShutdownHook();
		
		System.out.println("**************************");
		Pepsi temp2=(Pepsi) context.getBean("p1");
		System.out.println(temp2);
		
		
		System.out.println("..........................");
		Example e1=(Example) context.getBean("employee");
		System.out.println(e1);
	}

}
