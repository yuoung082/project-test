package com.develop.test.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.develop.test.user.model.User;
import com.develop.test.user.service.UserService;

@Controller
@RequestMapping("/user")
@ResponseBody
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/list")
	public List<User> getUser() {
		return userService.getUser();
	}
	
	@PostMapping("")
	public User addUser(@RequestBody User user) {
		
		return userService.addUser(user);
	}
	
	@PutMapping("")
	public User editUser(@RequestBody User user) {
		
		return userService.editUser(user);
	}
	
	@DeleteMapping("/{id}")
	public User removeUser(@PathVariable String id) {
		return userService.removeUser(id);
	}
}
