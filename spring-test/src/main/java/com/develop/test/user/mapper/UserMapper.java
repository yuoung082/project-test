package com.develop.test.user.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import com.develop.test.user.model.User;

@Mapper
public interface UserMapper {

	List<User> selectUser();
	
	User selectUserById(User user);
	
	int insertUser(User user);
	
	int updateUser(User user);
	
	int deleteUser(User user);
}
