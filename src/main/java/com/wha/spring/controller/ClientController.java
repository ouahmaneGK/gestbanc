package com.wha.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.wha.spring.iservice.ClientService;
import com.wha.spring.model.Client;

@RestController
@RequestMapping("clients")
public class ClientController {
	
	@Autowired
	ClientService clientService;

	@RequestMapping(value = "/create/nerd", method = RequestMethod.GET)
	public void nerd() {
		Client c1 = new Client("Bill", "danny", "b.mmm@hotmail.fr", "oooooo59100 Roubaix", "555524", "bhill", "bh", 1500, null);
		Client c2 = new Client("Till", "kanny", "b.ggg@hotmail.fr", "2 rssssss Roubaix", "8888324", "bhill", "bh", 1500, null);
		Client c3 = new Client("Kill", "manny", "b.ddddl@hotmail.fr", "qqqqqqq59100 Roubaix", "66666324", "bhill", "bh", 1500, null);
		
		//clientService.saveClient(c1);
		clientService.saveClient(c2);
		clientService.saveClient(c3);
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
	
	//@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping("/delete/{id}")
	public void deleteClient(@PathVariable int id) {
		clientService.deleteClient(id);
	}
	
	//@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "/get/client/{id}", method = RequestMethod.GET)
	public Client findById(@PathVariable int id) {
		Client client = clientService.findById(id);
		 return client;
	}

	//@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "/get/all", method = RequestMethod.GET)
	public ResponseEntity<List<Client>> getAll() {
		List<Client> resultat = clientService.findAllClients();
		return new ResponseEntity<List<Client>>(resultat, HttpStatus.OK);
	}
	
	
	@RequestMapping("/name/{nom}")
	public Client rechercheParNom(@PathVariable  String nom){
		
		return   clientService.getByName(nom);
		
	}
	
	
	
}
