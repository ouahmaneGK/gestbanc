package com.wha.spring.idao;

import java.io.Serializable;
import java.util.List;

import com.wha.spring.model.Client;

public interface ClientDao {
		
	Client saveClient(Client client);

	void updateClient(Client client);

	void deleteClient(int id);
	
	Client findById(int id);
	
	public List<Client> findAllClients();

	//void modifDecouvert(int idCompte, int montant);

}


