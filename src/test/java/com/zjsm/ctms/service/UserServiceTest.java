package com.zjsm.ctms.service;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zjsm.ctms.model.User;

public class UserServiceTest {
	
	private ApplicationContext applicationContext;
	
	@Before
	public void setUp() throws Exception {
		String[] xmlPath = new String[]{"spring/spring-service.xml", "spring/spring-dao.xml"};
		applicationContext = new ClassPathXmlApplicationContext(xmlPath);
	}

	@Test
	public void testInsertUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindUserByNo() {
		UserService userService = applicationContext.getBean("userServiceImpl",UserService.class);
		User user = userService.findUserByNo("001");
		System.out.println(user);
	}

	@Test
	public void testFindUserAll() {
		UserService bean = applicationContext.getBean("userServiceImpl",UserService.class);
		ArrayList<User> findUserAll = bean.findUserAll();
		for(User user:findUserAll) {
			System.out.println(user);
		}
	}

}
