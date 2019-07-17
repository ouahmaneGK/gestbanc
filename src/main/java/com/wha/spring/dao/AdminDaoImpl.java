package com.wha.spring.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wha.spring.idao.AdminDao;
import com.wha.spring.model.Administrateur;
import com.wha.spring.model.Client;
import com.wha.spring.model.Conseiller;
import com.wha.spring.model.DemandeOuverture;
import com.wha.spring.model.User;

@Repository("adminDao")
@Transactional
public class AdminDaoImpl extends AbstractDao implements AdminDao {
	
	/*public String creationConseiller(){
		
	}
	
	public void supprimerConseiller(conseiller){
		
	}*/

	@Override
	public void reaffectationClient(Client client, Conseiller conseiller) {
		// TODO Auto-generated method stub

	}

	@Override
	public String affectationDemandeOuverture(DemandeOuverture demande,
			Conseiller conseiller) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Administrateur saveAdministrateur(Administrateur administrateur) {
		em.persist(administrateur);
		return administrateur; 
		
	}

	@Override
	public Administrateur findById(int id) {
		return (Administrateur) em.find(Administrateur.class, id);
	}

	@Override
	public void updateAdministrateur(Administrateur administrateur) {
		em.merge(administrateur);
		
	}
	
	@Override
	public void deleteAdministrateur(int id) {
		em.remove(findById(id));
	}

	@Override
	public List<Administrateur> findAllAdministrateurs() {
		return em.createQuery("From Administrateur").getResultList();
	}



}
