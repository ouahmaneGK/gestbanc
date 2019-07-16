package com.wha.spring.idao;

import com.wha.spring.model.Client;
import com.wha.spring.model.Conseiller;
import com.wha.spring.model.DemandeOuverture;

public interface AdminDao {

//	Conseiller creationConseiller(Conseiller conseiller);
//
//	void supprimerConseiller(Conseiller conseiller);

	void reaffectationClient(Client client, Conseiller conseiller);

	String affectationDemandeOuverture(DemandeOuverture demandeOuverture,
			Conseiller conseiller);

}