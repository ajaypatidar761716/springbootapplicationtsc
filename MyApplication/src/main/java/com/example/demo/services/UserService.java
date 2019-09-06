package com.example.demo.services;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

import antlr.collections.List;

@Service
@Transactional
public class UserService 
{
	
	private final UserRepository userrepository;
	public UserService(UserRepository userrepository)
	{
		this.userrepository=userrepository;
	}
  
	public void saveMyUser(User user)
  {
	  userrepository.save(user);
  }
  
  public java.util.List<User> showAllUsers()
  {
	  java.util.List<User> users=new ArrayList<User>();
	  for(User user:userrepository.findAll()) 
	  {
		  users.add(user);
		  
	  }
		  return users;
  }
  
}
