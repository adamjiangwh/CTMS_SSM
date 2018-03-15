package com.zjsm.ctms.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zjsm.ctms.model.User;
import com.zjsm.ctms.service.UserService;

@Controller
@RequestMapping("/login")
public class LoginController {

	@Resource
	private UserService userService;
	
	@RequestMapping("/jump")
	public String login() {	    
		
	    return "login";
	}
	
	@RequestMapping("/tohome")
	public String toHome(HttpServletRequest request, HttpServletResponse response) {
		request.getSession().invalidate();
		String user = request.getParameter("logname");
	    String pass = request.getParameter("logpass");
	    String path = null;
	    
	    User info = userService.findUserByNo(user);
	    int type = 0;
	    
	    if(info == null) {
	    	 request.setAttribute("desc", "该用户不存在！");
	    	 System.out.println(1111);
	    	 return "redirect:../login/jump";
	     }
	     else if (user != null && user.equals(info.getEmpNo()) && pass != null && pass.equals(info.getEmpPass()))
	     {
	    	 type = info.getType();
	    	 path = info.getHeadPath();
	    	 request.getSession().setAttribute("path", path);
	    	 request.getSession().setAttribute("user", user);
	    	 request.getSession().setAttribute("type", type);
	         request.setAttribute("type", type);
	    	 request.getSession().setAttribute("loginflag", "ok");
	    	 request.setAttribute("logname", user);
	    	 request.setAttribute("logpass", pass);
	    	 System.out.println(2222);
	     }
	     else
	     {
	         request.setAttribute("desc", "用户名或密码错误!");
	         System.out.println(3333);
	         return "redirect:../login/jump";
	     }
	    System.out.println(4444);
	    return "redirect:home";
	}
	
	@RequestMapping("/home")
	public String home() {
		return "home";
	}
}
