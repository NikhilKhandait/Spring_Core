package com.rays.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollection {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("collection.xml");

		MyBean mybean = (MyBean) context.getBean("myBean");
		mybean.displayData();

		/*
		 * DataSource datasource = (DataSource) context.getBean("dataSource");
		 * System.out.println(datasource.toString());
		 */
	}
}
