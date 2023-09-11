package com.springcore.Lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean {

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		//this is init method
		System.out.println("taking pepsi:init");
	}

	public void destroy() throws Exception {
		//this  is destroy method
		System.out.println("going to put bottle back to shop: destroy");
		
		
	}
	
}
