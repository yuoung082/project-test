package com.develop.test.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.develop.test.user.mapper.UserMapper;
import com.develop.test.user.model.User;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {
	
	@Autowired
	UserMapper userMapper;
	
	public List<User> getUser() {
		
		List<User> userlist = userMapper.selectUser();

		log.info("{}",userlist);
		
		return userlist;
	}
	
	public User getUserById(User user) {
		
		User targetUser = userMapper.selectUserById(user);

		log.info("{}",targetUser);
		
		return targetUser;
	}
	
	public User addUser(User user) {
		
		int result = userMapper.insertUser(user);
		
		log.info("{}",result);
		
		if(result == 1) {
			return user;
		}
		
		return null;
	}
	
	public User editUser(User user) {
		
		int result = userMapper.updateUser(user);
		
		log.info("{}",result);
		
		if(result == 1) {
			return user;
		}
		
		return null;
	}
	
	public User removeUser(String id) {
		
		User user = new User();
		user.setId(id);
		
		User targetUser = getUserById(user);
		
		int result = userMapper.deleteUser(targetUser);
		
		log.info("{}",result);
		
		if(result == 1) {
			return targetUser;
		}
		
		return null;
	}
	
}
