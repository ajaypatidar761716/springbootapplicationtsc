package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.example.demo.model.User;
import com.example.demo.services.UserService;

@Controller
public class ApplicationController 
{
@Autowired
private UserService userservice;

@RequestMapping("/welcome")
public String welcome(HttpServletRequest request)
{
	request.setAttribute("mode","MODE_HOME");
	return "welcomepage";
}

@RequestMapping("/register")
public String registration(HttpServletRequest request)
{
	request.setAttribute("mode","MODE_REGISTER");
	return "welcomepage";
	
}

@PostMapping("/save-user")
public String registerUser(@ModelAttribute User user,BindingResult bindingresult,HttpServletRequest request)
{
	userservice.saveMyUser(user);
	request.setAttribute("mode","MODE_HOME");
	return "welcomepage";
}

@GetMapping("/show-users")
public String showAllUsers(HttpServletRequest request)
{
	request.setAttribute("users", userservice.showAllUsers()); 
	request.setAttribute("mode","ALL_USERS");
	return "welcomepage";
}
public String deleteusers()
{
	return "welcomepage";
}

}
