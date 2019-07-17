package com.wha.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wha.spring.iservice.ClientPotentielService;
import com.wha.spring.model.ClientPotentiel;


@RestController
@RequestMapping("clientspotentiels")
public class ClientPotentielController  {
	
	@Autowired
	ClientPotentielService clientPotentielService;
	
	
	@RequestMapping(value = "/create/dummy", method = RequestMethod.GET)
	public ClientPotentiel dummy() {
		ClientPotentiel c1 = new ClientPotentiel(0, "Jemal Ahmed", "Ahmed.Jemal", "jmlhmd@gmail.com", null, null, 0, null, null);
		clientPotentielService.saveClientPotentiel(c1);
		return c1;
	}
	
	@RequestMapping(value = "/get/all", method = RequestMethod.GET)
	public ResponseEntity<List<ClientPotentiel>>getAll() {
		List<ClientPotentiel> resultat = clientPotentielService.findAllClientPotentiels();
		return new ResponseEntity<List<ClientPotentiel>>(resultat, HttpStatus.OK);
	}
	
	
	//@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/create")
	public ClientPotentiel createClientPotentiel(@RequestBody ClientPotentiel clientPotentiel) {
		ClientPotentiel newAdmin = clientPotentielService.saveClientPotentiel(clientPotentiel);
		return newAdmin;
	}


	//@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping("/update")
	public ClientPotentiel updateClientPotentiel (@RequestBody ClientPotentiel clientPotentiel) {
		clientPotentielService.updateClientPotentiel(clientPotentiel);
		return clientPotentiel;
	}

}

