package com.wha.spring.idao;

import java.util.List;

import com.wha.spring.model.DemandeOuverture;

public interface DemandeOuvertureDao {
	
	DemandeOuverture saveDemandeOuverture(DemandeOuverture demandeOuverture);

	void updateDemandeOuverture(DemandeOuverture demande);

	public List<DemandeOuverture> findAllDemandeOuvertures();

	DemandeOuverture findById(int id);

	void deleteDemandeOuverture(int id);

}
