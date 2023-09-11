package com.springcore.stereoType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ApplicationContext context=new ClassPathXmlApplicationContext("Stereoconfig.xml");
			Student s1=(Student) context.getBean("student");
//			System.out.println(s1);
//			System.out.println(s1.getAdress());
//			System.out.println(s1.getAdress().getClass().getName());
			System.out.println(s1.hashCode());
			Student s2=(Student) context.getBean("student");
			System.out.println(s2.hashCode());
			
			
			
	}

}
