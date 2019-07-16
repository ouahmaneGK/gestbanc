package com.wha.spring.idao;

import java.util.List;

import com.wha.spring.model.Administrateur;
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

	Administrateur saveAdministrateur(Administrateur administrateur);

	Administrateur findById(int id);

	void updateAdministrateur(Administrateur administrateur);

	List<Administrateur> findAllAdministrateurs();

	void deleteAdministrateur(int id);
	
	
	

}