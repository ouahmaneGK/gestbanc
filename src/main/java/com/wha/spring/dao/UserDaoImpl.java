
package com.wha.spring.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wha.spring.idao.UserDao;
import com.wha.spring.model.User;

@Repository("userDao")
@Transactional
public class UserDaoImpl extends AbstractDao implements UserDao {

	public User saveUser(User user) {
		em.persist(user);
		return user;
	}

	public void updateUser(User user) {
		em.merge(user);
	}

	public void deleteUser(int id) {
		em.remove(findById(id));

	}

	public User findById(int id) {
		// Appel de la méthod init de la class Logger
		return (User) em.find(User.class, id);
	}

	public List<User> findAllUsers() {
		return em.createQuery("From User").getResultList();
	}

}
