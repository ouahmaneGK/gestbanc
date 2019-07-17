package com.wha.spring.idao;

import java.util.List;

import com.wha.spring.model.Compte;

public interface CompteDao {
	
	Compte saveCompte(Compte compte);

	void updateCompte(Compte compte);

	void deleteCompte(int id);
	
	Compte findById(int id);
	
	public List<Compte> findAllComptes();

	void modifDecouvert(int idCompte, int montant);
}
