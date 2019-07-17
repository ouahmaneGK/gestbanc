package com.wha.spring.idao;

import java.util.List;

import com.wha.spring.model.Compte;
import com.wha.spring.model.Conseiller;
import com.wha.spring.model.User;

public interface ConseillerDao {
	
	User saveConseiller(Conseiller conseiller);

	void updateConseiller(Conseiller conseiller);

	public List<Conseiller> findAllConseillers();

	Conseiller findById(int id);

	void deleteConseiller(int id);

	Conseiller getByName(String nom);

}
