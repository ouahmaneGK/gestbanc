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

import com.wha.spring.iservice.ClientService;
import com.wha.spring.model.Client;
import com.wha.spring.model.Conseiller;

@RestController
@RequestMapping("clients")
public class ClientController {
	
	@Autowired
	ClientService clientService;

	@RequestMapping(value = "/create/nerd", method = RequestMethod.GET)
	public void nerd() {
		Client c1 = new Client("Hill", "Benny", "b.hill@hotmail.fr", "2 rue Nain 59100 Roubaix", "0621222324", "bhill", "bh", 1500, null);
		clientService.saveClient(c1);
	}
	//@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "/get/all", method = RequestMethod.GET)
	public ResponseEntity<List<Client>> getAll() {
		List<Client> resultat = clientService.findAllClients();
		return new ResponseEntity<List<Client>>(resultat, HttpStatus.OK);
	}

	//@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/create")
	public Client createClient(@RequestBody Client client) {
		Client newClient = clientService.saveClient(client);
		return newClient;
	}

	//@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping("/update")
	public Client updateClient(@RequestBody Client client) {
		clientService.updateClient(client);
		return client;
	}
	
	
}
