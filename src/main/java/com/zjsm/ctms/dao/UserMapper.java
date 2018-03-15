package com.zjsm.ctms.dao;

import java.util.ArrayList;

import com.zjsm.ctms.model.User;

public interface UserMapper {
	
	// 添加用户
	public boolean insertUser(User user);
	
	// 修改用户
	public boolean updateUser(String emp_no);
	
	// 删除用户
	public boolean deleteUser(String emp_no);
	
	// 根据账号查询用户信息
	public User findUserByNo(String emp_no);
	
	// 查询所有用户信息
	public ArrayList<User> findUserAll();
	
}
