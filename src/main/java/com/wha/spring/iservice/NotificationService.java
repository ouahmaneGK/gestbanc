package com.wha.spring.iservice;

import java.util.List;

import com.wha.spring.model.Notification;

public interface NotificationService {
	
	Notification saveNotification(Notification notification);
	
	void updateNotification(Notification notification);
	
	void deleteNotification(int id);
	
	Notification findById(int id);
	
	List<Notification> findAllNotifications();

}
