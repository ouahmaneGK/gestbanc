package com.wha.spring.idao;

import java.io.Serializable;
import java.util.List;

import com.wha.spring.model.User;

public interface UserDao {
	
	User saveUser(User employee);

	void updateUser(User employee);

	void deleteUser(int id);
	
	User findById(int id);
	
	public List<User> findAllUsers();
}
