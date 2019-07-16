package com.wha.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wha.spring.iservice.ClientPotentielService;
import com.wha.spring.model.ClientPotentiel;
import com.wha.spring.model.User;


@RestController
@RequestMapping("clientspotentiels")
public class ClientPotentielController  {
	
	@Autowired
	ClientPotentielService clientPotentielService;
	
	
	@RequestMapping(value = "/create/dummy", method = RequestMethod.GET)
	public void demandes() {
		ClientPotentiel c1 = new ClientPotentiel(0, "Jemal Ahmed", "Ahmed.Jemal", "jmlhmd@gmail.com", null, null, 0, null, null);
		ClientPotentiel c2 = new ClientPotentiel(0, "Leanne Graham", "Bret", "Sincere@april.biz", null, null, 0, null, null);
		ClientPotentiel c3 = new ClientPotentiel(0, "Clementina DuBuque", "Moriah.Stanton", "Rey.Padberg@karina.biz", null, null, 0, null, null);
		clientPotentielService.saveClientPotentiel(c1);
		clientPotentielService.saveClientPotentiel(c2);
		clientPotentielService.saveClientPotentiel(c3);
	}
	
	@RequestMapping(value = "/get/all", method = RequestMethod.GET)
	public ResponseEntity<List<ClientPotentiel>>getAll() {
		List<ClientPotentiel> resultat = clientPotentielService.findAllClientPotentiels();
		return new ResponseEntity<List<ClientPotentiel>>(resultat, HttpStatus.OK);
	}

}

