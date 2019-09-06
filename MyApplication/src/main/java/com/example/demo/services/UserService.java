package com.example.demo.services;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

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
}
