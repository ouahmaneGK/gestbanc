package com.wha.spring.iservice;

import java.util.List;

import com.wha.spring.model.Compte;

public interface CompteService {
	
	Compte saveCompte(Compte compte);

	void updateCompte(Compte compte);

	void deleteCompte(int id);
	
	Compte findById(int id);
	
	public List<Compte> findAllComptes();
	
	//void modifDecouvert(int idCompte, int montant);

}
