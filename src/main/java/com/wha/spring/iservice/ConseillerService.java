package com.wha.spring.iservice;

import java.util.List;

import com.wha.spring.model.Compte;
import com.wha.spring.model.Conseiller;
import com.wha.spring.model.User;

public interface ConseillerService {
	Conseiller saveConseiller(Conseiller conseiller);

	Conseiller findById(int id);

	void updateConseiller(Conseiller conseiller);

	public List<Conseiller> findAllConseillers();

	public void deleteConseiller(int id);

	Conseiller getByName(String nom);
}
