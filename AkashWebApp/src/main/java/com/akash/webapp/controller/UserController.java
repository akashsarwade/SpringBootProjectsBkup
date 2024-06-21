package com.akash.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akash.webapp.entity.User;
import com.akash.webapp.service.UserService;

@RestController
//@CrossOrigin
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping("/addUser")
	public User createUser(@RequestBody User user) {

			return userService.createUser(user);
	}

//	@RequestMapping("/login")
//	public boolean login(@RequestBody User user) {
//		return user.getName().equals("user") && user.getPassword().equals("password");
//	}
//
//	@RequestMapping("/user")
//	public Principal user(HttpServletRequest request) {
//		String authToken = request.getHeader("Authorization").substring("Basic".length()).trim();
//		return () -> new String(Base64.getDecoder().decode(authToken)).split(":")[0];
//}	


}
