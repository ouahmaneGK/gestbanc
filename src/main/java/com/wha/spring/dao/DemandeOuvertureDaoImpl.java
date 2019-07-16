
package com.wha.spring.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wha.spring.idao.DemandeOuvertureDao;
import com.wha.spring.model.DemandeOuverture;

@Repository("demandeOuvertureDao")
@Transactional
public class DemandeOuvertureDaoImpl extends AbstractDao implements DemandeOuvertureDao {

	@Override
	public DemandeOuverture saveDemandeOuverture(DemandeOuverture demandeOuverture) {
		em.persist(demandeOuverture);
		return demandeOuverture;
	}

	@Override
	public void updateDemandeOuverture(DemandeOuverture demandeOuverture) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<DemandeOuverture> findAllDemandeOuvertures() {
		return em.createQuery("From DemandeOuverture").getResultList();
	}

	@Override
	public DemandeOuverture findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteDemandeOuverture(int id) {
		// TODO Auto-generated method stub

	}

}
