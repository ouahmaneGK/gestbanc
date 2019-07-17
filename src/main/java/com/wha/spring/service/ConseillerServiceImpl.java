package com.wha.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wha.spring.idao.ConseillerDao;
import com.wha.spring.iservice.ConseillerService;
import com.wha.spring.model.Compte;
import com.wha.spring.model.Conseiller;

@Service("conseillerService")
@Transactional
public class ConseillerServiceImpl implements ConseillerService {

	@Autowired
	ConseillerDao conseillerDao;

	public Conseiller saveConseiller(Conseiller conseiller) {
		conseillerDao.saveConseiller(conseiller);
		return conseiller;

	}

	public void updateConseiller(Conseiller user) {
		conseillerDao.updateConseiller(user);
	}

	public List<Conseiller> findAllConseillers() {
		return conseillerDao.findAllConseillers();
	}

	public void deleteConseiller(int id) {
		// TODO Auto-generated method stub
		conseillerDao.deleteConseiller(id);
	}

	public Conseiller findById(int id) {
		return conseillerDao.findById(id);
	}

	@Override
	public Conseiller getByName(String nom) {
		
		return conseillerDao.getByName(nom);
	}

}
