package com.wha.spring.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wha.spring.idao.ConseillerDao;
import com.wha.spring.idao.UserDao;
import com.wha.spring.model.Compte;
import com.wha.spring.model.Conseiller;
import com.wha.spring.model.User;

@Repository("conseillerDao")
@Transactional
public class ConseillerDaoImpl extends AbstractDao implements ConseillerDao {

	@Override
	public Conseiller saveConseiller(Conseiller conseiller) {
		em.persist(conseiller);
		return conseiller;
	}

	@Override
	public void updateConseiller(Conseiller conseiller) {
		em.merge(conseiller);
		
	}

	@Override
	public List<Conseiller> findAllConseillers() {
		// TODO Auto-generated method stub
	 return em.createQuery("From Conseiller").getResultList();
	}

	@Override
	public Conseiller findById(int id) {
		return  em.find(Conseiller.class, id);
		 
	}

	@Override
	public void deleteConseiller(int id) {
		em.remove(findById(id));
		
	}

	@Override
	public Conseiller getByName(String pNom) {
		
		
		return   (Conseiller) em.createQuery("from Conseiller c where c.nom= :pNom").setParameter("pNom", pNom).getSingleResult();
		
		 
	}
	

	

}
