package com.wha.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wha.spring.idao.ClientDao;
import com.wha.spring.iservice.ClientService;
import com.wha.spring.model.Client;

@Service("clientService")
@Transactional
public class ClientServiceImpl implements ClientService {
	
	@Autowired
	ClientDao clientDAO;

	public Client saveClient (Client  client) {
		clientDAO.saveClient(client);
		return client;
	}

	public void updateClient(Client client) {
		clientDAO.updateClient(client);
	}

	public void deleteClient(int id) {
		clientDAO.deleteClient(id);
	}

	public Client findById(int id) {
		return clientDAO.findById(id);
	}
	
	public List<Client> findAllClients() {
		return clientDAO.findAllClients();
	}

	@Override
	public Client getByName(String nom) {
		return clientDAO.getByName(nom);
		 
	}

	

}



