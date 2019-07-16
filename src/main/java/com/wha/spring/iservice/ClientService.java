package com.wha.spring.iservice;

import java.util.List;

import com.wha.spring.model.Client;

public interface ClientService {

	Client saveClient(Client client);

	void updateClient(Client client);

	void deleteClient(int id);
	
	Client findById(int id);
	
	public List<Client> findAllClients();
}
