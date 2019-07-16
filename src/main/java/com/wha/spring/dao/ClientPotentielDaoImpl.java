package com.wha.spring.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wha.spring.idao.ClientPotentielDao;
import com.wha.spring.model.ClientPotentiel;

@Repository("clientPotentielDao")
@Transactional
public class ClientPotentielDaoImpl extends AbstractDao implements ClientPotentielDao {

	@Override
	public ClientPotentiel saveClientPotentiel(ClientPotentiel clientpotentiel) {
		em.persist(clientpotentiel);
		return clientpotentiel;
	}

	@Override
	public void updateClientPotentiel(ClientPotentiel clientpotentiel) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<ClientPotentiel> findAllClientPotentiels() {
		return em.createQuery("From ClientPotentiel").getResultList();
	}

	@Override
	public ClientPotentiel findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteClientPotentiel(int id) {
		// TODO Auto-generated method stub

	}

}
