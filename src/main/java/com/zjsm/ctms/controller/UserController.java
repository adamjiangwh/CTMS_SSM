package com.zjsm.ctms.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zjsm.ctms.model.User;
import com.zjsm.ctms.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	private UserService userService;
	
	@RequestMapping("/test")
	public String test() {
		return "test";
	}
	
	// 查询所有用户
	@RequestMapping("/userlist")
	@ResponseBody
	public JSONObject list(){
		
		JSONObject jsonObject = new JSONObject();
		
		List<User> list = userService.findUserAll();
		System.out.println(list);
		
		jsonObject.put("userList", list);
		System.out.println(JSON.toJSONString(jsonObject));
		return jsonObject;
	}
	
	@RequestMapping("/list")
	public String list(Model model){
		
		List<User> list = userService.findUserAll();
		
		model.addAttribute("userList", list);
		
		return "test";
	}
	
}
