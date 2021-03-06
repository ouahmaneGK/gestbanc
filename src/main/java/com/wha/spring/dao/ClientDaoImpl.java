package com.wha.spring.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wha.spring.idao.ClientDao;
import com.wha.spring.model.Client;
import com.wha.spring.model.Conseiller;

@Repository("clientDao")
@Transactional
public abstract class ClientDaoImpl extends AbstractDao implements ClientDao {
	
	public Client saveClient(Client client) {
		em.persist(client);
		return client;
	}

	public void updateClient(Client client) {
		em.merge(client);
	}

	public void deleteClient(int id) {
		em.remove(findById(id));
	}

	public Client findById(int id) {
		return (Client) em.find(Client.class, id);
	}

	public List<Client> findAllClients() {
		return em.createQuery("From Client").getResultList();
	}
	
	@Override
	public void reaffectationClient(Client client, Conseiller conseiller) {
		client.setConseiller(conseiller);
		em.merge(client);
	}

	@Override
	public Client getByName(String pNom) {
		return   (Client) em.createQuery("from Client c where c.nom = :pNom").setParameter("pNom", pNom).getSingleResult();
	}

}


