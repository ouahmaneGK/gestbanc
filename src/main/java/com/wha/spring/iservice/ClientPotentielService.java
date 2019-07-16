package com.wha.spring.iservice;

import java.util.List;

import com.wha.spring.model.ClientPotentiel;


public interface ClientPotentielService {
	
	ClientPotentiel saveClientPotentiel(ClientPotentiel clientpotentiel);

	ClientPotentiel findById(int id);

	void updateClientPotentiel(ClientPotentiel clientpotentiel);

	public List<ClientPotentiel> findAllClientPotentiels();

	public void deleteClientPotentiel(int id);

}
