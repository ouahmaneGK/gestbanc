package com.wha.spring.idao;

import java.util.List;

import com.wha.spring.model.DemandeOuverture;

public interface DemandeOuvertureDao {
	
	DemandeOuverture saveDemandeOuverture(DemandeOuverture demandeOuverture);

	void updateUser(DemandeOuverture demande);

	public List<DemandeOuverture> findAllDemandes();

	DemandeOuverture findById(int id);

	void deleteDemandeOuverture(int id);

}
