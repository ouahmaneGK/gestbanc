package com.wha.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wha.spring.idao.AdminDao;
import com.wha.spring.iservice.AdminService;
import com.wha.spring.model.Administrateur;

@Service("adminService")
@Transactional
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	AdminDao adminDao;

	@Override
	public Administrateur saveAdministrateur(Administrateur administrateur) {
		adminDao.saveAdministrateur(administrateur);
		return administrateur;
	}

	@Override
	public Administrateur findById(int id) {
		return adminDao.findById(id);
	
	}

	@Override
	public void updateAdministrateur(Administrateur administrateur) {
		adminDao.updateAdministrateur(administrateur);
		
	}

	@Override
	public List<Administrateur> findAllAdministrateurs() {
		return adminDao.findAllAdministrateurs();
	}

	@Override
	public void deleteAdministrateur(int id) {
		adminDao.deleteAdministrateur(id);
		
	}

}
