package com.zjsm.ctms.dao;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zjsm.ctms.model.User;

public class UserMapperTest {

private ApplicationContext applicationContext;
	
	@Before
	public void setUp() throws Exception {
		String xmlPath = "spring/spring-dao.xml";
		applicationContext = new ClassPathXmlApplicationContext(xmlPath);
	}

	@Test
	public void testInsertUser() {

	}

	@Test
	public void testUpdateUser() {

	}

	@Test
	public void testDeleteUser() {

	}

	@Test
	public void testFindUserByNo() {
		UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
		User user = userMapper.findUserByNo("001");
		System.out.println(user);
	}

	@Test
	public void testFindUserAll() {
		UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
		List<User> user = userMapper.findUserAll();
		System.out.println(user);
	}

}
