package com.rays.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Order2Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Order2.xml");

		Order2 order2 = (Order2) context.getBean("order2");
		
		order2.bookATicket(2);
	}

}
