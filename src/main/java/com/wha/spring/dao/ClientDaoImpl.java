package com.wha.spring.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wha.spring.idao.ClientDao;
import com.wha.spring.model.Client;

@Repository("clientDao")
@Transactional
public class ClientDaoImpl extends AbstractDao implements ClientDao {
	
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
		return em.createQuery("From User").getResultList();
	}

}


