package com.wha.spring.iservice;

import java.util.List;


import com.wha.spring.model.DemandeOuverture;

public interface DemandeOuvertureService{
	
	DemandeOuverture saveUser(DemandeOuverture demandeOuverture);

	DemandeOuverture findById(int id);

	void DemandeOuverture(DemandeOuverture demandeOuverture);

	public List<DemandeOuverture> findAllDemandeOuvertures();

	public void deleteDemandeOuverture(int id);

}
