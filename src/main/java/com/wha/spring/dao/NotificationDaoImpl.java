package com.wha.spring.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wha.spring.idao.NotificationDao;
import com.wha.spring.idao.UserDao;
import com.wha.spring.model.Notification;
import com.wha.spring.model.User;

@Repository("notificationDao")
@Transactional
public class NotificationDaoImpl extends AbstractDao implements NotificationDao {

	public Notification saveNotification(Notification notification) {
		em.persist(notification);
		return notification;
	}

	public void updateNotification(Notification notification) {
		em.merge(notification);
	}

	public void deleteNotification(int id) {
		em.remove(findById(id));
	}
	
	public Notification findById(int id) {
		return (Notification) em.find(Notification.class, id);
	}
	
	public List<Notification> findAllNotifications() {
		return em.createQuery("From Notifications").getResultList();
	}
}
