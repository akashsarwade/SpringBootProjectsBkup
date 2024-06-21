package com.akash.webapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akash.webapp.entity.User;
import com.akash.webapp.repo.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;
	
	public User createUser(User user) {
	return userRepo.save(user);
	}
	
}
