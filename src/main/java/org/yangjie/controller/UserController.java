package org.yangjie.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.yangjie.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	
	/**
	 * 用户登录
	 * @return
	 */
	@GetMapping("/login")
	public String login(){
		return "login";
	}
	
	/**
	 * 用户登录
	 * @return
	 */
	@PostMapping("/login")
	public String login(String username, String password, 
			HttpServletRequest request, HttpSession session){
		if(userService.checkUser(username, password)){
			session.setAttribute("username", username);
			return "index";
		} else {
			request.setAttribute("msg", "username or password error!");
			return "login";
		}
	}
	
	
}
