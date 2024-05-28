package com.rays.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.rays.dto.UserDTO;
import com.rays.service.UserServiceInt;

@Component("testUserService")
public class TestUserService {

	public static ApplicationContext context = null;

	@Autowired
	private UserServiceInt s = null;

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		TestUserService test = (TestUserService) context.getBean("testUserService");

		test.testAdd();
	}

	private void testAdd() {

		UserDTO dto = new UserDTO();

		// dto.setId(1);
		dto.setFirstName("nikhil");
		dto.setLastName("khandait");
		dto.setLogin("nikhil@gmail");
		dto.setPassword("nikhil#123");
		long pk = s.add(dto);
		System.out.println("pk>>>" + pk);

	}
}