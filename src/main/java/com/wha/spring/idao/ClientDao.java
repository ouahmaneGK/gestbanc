package com.wha.spring.idao;

import java.util.List;

import com.wha.spring.model.Client;
import com.wha.spring.model.Conseiller;

public interface ClientDao {
		
	Client saveClient(Client client);

	void updateClient(Client client);

	void deleteClient(int id);
	
	Client findById(int id);
	
	public List<Client> findAllClients();


	void reaffectationClient(Client client, Conseiller conseiller);

	Client getByName(String nom);


}


