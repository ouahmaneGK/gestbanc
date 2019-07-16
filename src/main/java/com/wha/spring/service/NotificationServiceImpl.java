package com.wha.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wha.spring.idao.NotificationDao;
import com.wha.spring.idao.UserDao;
import com.wha.spring.iservice.NotificationService;
import com.wha.spring.model.Notification;

@Service("notificationService")
@Transactional
public class NotificationServiceImpl implements NotificationService{
	
	@Autowired
	NotificationDao notificationDAO;
	
	public Notification saveNotification(Notification notification) {
		notificationDAO.saveNotification(notification);
		return notification;
	}
	
	public void updateNotification(Notification notification) {
		notificationDAO.updateNotification(notification);
	}

	public List<Notification> findAllUsers() {
		return notificationDAO.findAllNotifications();
	}

	public void deleteNotification(int id) {
		notificationDAO.deleteNotification(id);
	}

	public Notification findById(int id) {
		return notificationDAO.findById(id);
	}

	@Override
	public List<Notification> findAllNotifications() {
		return null;
	}

}


