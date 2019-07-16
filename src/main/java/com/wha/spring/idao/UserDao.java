package com.wha.spring.idao;

import java.io.Serializable;
import java.util.List;

import com.wha.spring.model.User;

public interface UserDao {
	User saveUser(User user);

	void updateUser(User user);

	public List<User> findAllUsers();

	User findById(int id);

	void deleteUser(int id);
}


