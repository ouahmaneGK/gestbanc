package com.wha.spring.idao;

import java.util.List;

import com.wha.spring.model.ClientPotentiel;


public interface ClientPotentielDao {

	ClientPotentiel saveClientPotentiel(ClientPotentiel clientpotentiel);

	void updateClientPotentiel(ClientPotentiel clientpotentiel);

	public List<ClientPotentiel> findAllClientPotentiels();

	ClientPotentiel findById(int id);

	void deleteClientPotentiel(int id);
	
}
