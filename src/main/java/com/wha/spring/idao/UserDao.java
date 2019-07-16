package com.wha.spring.idao;

import java.util.List;

import com.wha.spring.model.User;

public interface UserDao {
	User saveUser(User user);

	void updateUser(User user);

	void deleteUser(int id);
	
	User findById(int id);
	
	public List<User> findAllUsers();
}


