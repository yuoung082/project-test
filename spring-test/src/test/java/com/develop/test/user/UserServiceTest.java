package com.develop.test.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//import com.develop.test.user.model.User;
import com.develop.test.user.service.UserService;

@SpringBootTest
public class UserServiceTest {

	@Autowired
	UserService UserService;
	
	@Test
	public void test() {
		
		UserService.getUser();
		
		/*
		User user = new User();
		user.setId("5");
		user.setName("test");
		user.setAge(10);
		
		UserService.addUser(user);
		*/
		
		/*
		User user = new User();
		user.setId("5");
		user.setName("test2");
		user.setAge(20);
		 
		UserService.editUser(user);
		*/
		
		//UserService.removeUser("5");
		
	}
}
