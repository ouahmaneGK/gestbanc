package com.wha.spring.controller;

import java.util.List;

import javax.persistence.QueryHint;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wha.spring.iservice.ConseillerService;
import com.wha.spring.iservice.UserService;
import com.wha.spring.model.Compte;
import com.wha.spring.model.Conseiller;
import com.wha.spring.model.User;

@RestController
@RequestMapping("conseillers")
public class ConseillerController {

	@Autowired
    ConseillerService conseillerService;

	@RequestMapping(value = "/createconseiller", method = RequestMethod.GET) // ca marche!!
	public Conseiller dummy() {
		Conseiller c1 = new Conseiller(0, "Léo222", "Léo222", "leo222@sfr.fr", "chez lui dans 222 69100", "222221", "le con", "2222");
		conseillerService.saveConseiller(c1);
		return c1;
	}
	//@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "/get/all", method = RequestMethod.GET)
	public ResponseEntity<List<Conseiller>> getAll() {
		List<Conseiller> resultat = conseillerService.findAllConseillers();
		return new ResponseEntity<List<Conseiller>>(resultat, HttpStatus.OK);
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/create")
	public Conseiller createConseiller(@RequestBody Conseiller conseiller) {
		Conseiller newConseiller =  conseillerService.saveConseiller(conseiller);
		return newConseiller;
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping("/update")
	public Conseiller updateConseiller(@RequestBody Conseiller  conseiller) {
		conseillerService.updateConseiller(conseiller);
		return conseiller;
	}
	
	@DeleteMapping("/delete/{conseilleId}")
	public void deleteConseiller(@PathVariable int conseilleId) {
		conseillerService.deleteConseiller(conseilleId);
	}
	
	@RequestMapping("/get/{id}")
	public Conseiller getById(@PathVariable int id){
		return conseillerService.findById(id);
	}
		
	@RequestMapping("/name/{nom}")
	public Conseiller rechercheParNom(@PathVariable  String nom){
		return  conseillerService.getByName(nom);	
	}
	
}
