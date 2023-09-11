package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
			ApplicationContext context=new ClassPathXmlApplicationContext("Standaloneconfig.xml");
			Person p1=(Person) context.getBean("p1");
			System.out.println(p1);
			System.out.println(p1.getFriends().getClass().getName());
			
	}

}
