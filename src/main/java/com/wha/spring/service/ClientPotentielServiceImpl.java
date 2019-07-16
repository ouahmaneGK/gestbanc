package com.wha.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wha.spring.idao.ClientPotentielDao;
import com.wha.spring.iservice.ClientPotentielService;
import com.wha.spring.model.ClientPotentiel;

@Service("clientPotentielService")
@Transactional
public class ClientPotentielServiceImpl implements ClientPotentielService {
	
	@Autowired
	ClientPotentielDao clientPotentielDao;
	
	@Override
	public ClientPotentiel saveClientPotentiel(ClientPotentiel clientpotentiel) {
		clientPotentielDao.saveClientPotentiel(clientpotentiel);
		return clientpotentiel;
	}

	@Override
	public ClientPotentiel findById(int id) {
		return clientPotentielDao.findById(id);
	}

	@Override
	public void updateClientPotentiel(ClientPotentiel clientpotentiel) {
		clientPotentielDao.updateClientPotentiel(clientpotentiel);
	}

	@Override
	public List<ClientPotentiel> findAllClientPotentiels() {
		return clientPotentielDao.findAllClientPotentiels();
	}

	@Override
	public void deleteClientPotentiel(int id) {
		clientPotentielDao.deleteClientPotentiel(id);

	}

}
