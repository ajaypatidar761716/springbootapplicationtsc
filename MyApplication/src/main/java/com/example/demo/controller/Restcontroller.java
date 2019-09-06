package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.services.UserService;

@RestController
public class Restcontroller 
{
	@Autowired
	private UserService userservice;
	@GetMapping("/")
  public String hello()
  {
	  return "This is home page";
  }
	@GetMapping("/saveuser")
	public String saveUser(@RequestParam String firstname,@RequestParam String lastname,@RequestParam int age,@RequestParam String address)
	{
		User user=new User(firstname,lastname,age,address);
		userservice.saveMyUser(user);
		return "UserSaved";
	}
	
}
