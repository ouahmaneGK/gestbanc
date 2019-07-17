package com.wha.spring.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wha.spring.idao.ClientPotentielDao;
import com.wha.spring.model.ClientPotentiel;
import com.wha.spring.model.User;

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
		em.merge(clientpotentiel);

	}

	@Override
	public List<ClientPotentiel> findAllClientPotentiels() {
		return em.createQuery("From ClientPotentiel").getResultList();
	}

	@Override
	public ClientPotentiel findById(int id) {
		// Appel de la méthod init de la class Logger
				return (ClientPotentiel) em.find(ClientPotentiel.class, id);
	}

	@Override
	public void deleteClientPotentiel(int id) {
		em.remove(findById(id));

	}

}
