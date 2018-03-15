package com.zjsm.ctms.service.impl;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zjsm.ctms.dao.UserMapper;
import com.zjsm.ctms.model.User;
import com.zjsm.ctms.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper userMapper;
	
	@Override
	public boolean insertUser(User user) {
		boolean result = userMapper.insertUser(user);
		return result;
	}

	@Override
	public boolean updateUser(String emp_no) {
		boolean result = userMapper.updateUser(emp_no);
		return result;
	}

	@Override
	public boolean deleteUser(String emp_no) {
		boolean result = userMapper.deleteUser(emp_no);
		return result;
	}

	@Override
	public User findUserByNo(String emp_no) {
		User user = userMapper.findUserByNo(emp_no);
		return user;
	}

	@Override
	public ArrayList<User> findUserAll() {
		ArrayList<User> uList = userMapper.findUserAll();
		return uList;
	}

}
