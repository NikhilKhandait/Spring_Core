package com.rays.child;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestChild {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("child.xml");
		TestBean testBean = (TestBean) context.getBean("derivedTestBean");
		/*
		 * also run here testBean when we remove adbstract bar on xml file on child.xml
		 * they are also return different return
		 */
		System.out.println(testBean.toString());
	}

}
