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




import com.wha.spring.iservice.DemandeOuvertureService;
import com.wha.spring.model.DemandeOuverture;
import com.wha.spring.model.User;

@RestController
@RequestMapping("demandes")
public class DemandeOuvertureController {
	
	@Autowired
	DemandeOuvertureService demandeOuvertureService;
	
	@RequestMapping(value = "/create/dummy", method = RequestMethod.GET)
	public void demandes() {
		DemandeOuverture d1 = new DemandeOuverture(0, "Premiere demande", true,null, null);
		DemandeOuverture d2 = new DemandeOuverture(0, "Deuxi�me demande", false,null, null);
		DemandeOuverture d3 = new DemandeOuverture(0, "Troisieme demande ", true,null, null);
		demandeOuvertureService.saveDemandeOuverture(d1);
		demandeOuvertureService.saveDemandeOuverture(d2);
		demandeOuvertureService.saveDemandeOuverture(d3);
	}
	
	//@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "/get/all", method = RequestMethod.GET)
	public ResponseEntity<List<DemandeOuverture>> getAll() {
		List<DemandeOuverture> resultat = demandeOuvertureService.findAllDemandeOuvertures();
		return new ResponseEntity<List<DemandeOuverture>>(resultat, HttpStatus.OK);
	}

	/*	//@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/create")
	public User createUser(@RequestBody User user) {
		User newUser = userService.saveUser(user);
		return newUser;
	}

	//@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping("/update")
	public User updateUser(@RequestBody User user) {
		userService.updateUser(user);
		return user;
	}*/
	

}
