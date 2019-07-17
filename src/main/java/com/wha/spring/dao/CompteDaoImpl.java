package com.wha.spring.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wha.spring.idao.CompteDao;
import com.wha.spring.model.Compte;
import com.wha.spring.model.User;

@Repository("compteDao")
@Transactional
public class CompteDaoImpl extends AbstractDao implements CompteDao {
	
	public Compte saveCompte(Compte compte) {
		em.persist(compte);
		return compte;
	}

	public void updateCompte(Compte compte) {
		em.merge(compte);
	}

	public void deleteCompte(int id) {
		em.remove(findById(id));
	}

	public Compte findById(int id) {
		return (Compte) em.find(Compte.class, id);
	}

	public List<Compte> findAllComptes() {
		return em.createQuery("From Compte").getResultList();
	}

}
