package com.wha.spring.idao;

import java.io.Serializable;
import java.util.List;

import com.wha.spring.model.Notification;

public interface NotificationDao {
	
	Notification saveNotification(Notification notification);
	
	void updateNotification(Notification notification);
	
	void deleteNotification(int id);
	
	Notification findById(int id);
	
	List<Notification> findAllNotifications();
}
