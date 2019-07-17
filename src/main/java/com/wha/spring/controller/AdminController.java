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

import com.wha.spring.iservice.AdminService;
import com.wha.spring.iservice.ClientService;
import com.wha.spring.iservice.ConseillerService;
import com.wha.spring.model.Administrateur;
import com.wha.spring.model.Client;
import com.wha.spring.model.Conseiller;



@RestController
@RequestMapping("administrateurs")
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	@Autowired
	ConseillerService conseillerService;
	@Autowired
	ClientService clientService;
	
	@RequestMapping(value = "/create/dummy", method = RequestMethod.GET)
	public Administrateur dummy() {
		Administrateur a1 = new Administrateur(null, null);
		adminService.saveAdministrateur(a1);
		return a1;
	}
	
	//@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "/get/all", method = RequestMethod.GET)
	public ResponseEntity<List<Administrateur>> getAll() {
		List<Administrateur> resultat = adminService.findAllAdministrateurs();
		return new ResponseEntity<List<Administrateur>>(resultat, HttpStatus.OK);
	}

	//@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/create")
	public Administrateur createAdministrateur(@RequestBody Administrateur administrateur) {
		Administrateur newAdmin = adminService.saveAdministrateur(administrateur);
		return newAdmin;
	}


	//@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping("/update")
	public Administrateur updateAdministrateur(@RequestBody Administrateur administrateur) {
		adminService.updateAdministrateur(administrateur);
		return administrateur;
	}
	
	@RequestMapping("/get/{id}")
	public Administrateur getById(@PathVariable int id){
		return adminService.findById(id);
	}

	
	@DeleteMapping("/delete/{idAdmin}")
	public void deleteAdministrateur(@PathVariable int idAdmin) {
		adminService.deleteAdministrateur(idAdmin);
	}
	
	
	@PutMapping("/reaffectation/{idConseiller}/{idClient}")
	public void reaffectationClient(@PathVariable int idConseiller, @PathVariable int idClient) {
		Conseiller newConseiller = conseillerService.findById(idConseiller);
		Client client = clientService.findById(idClient);
		clientService.reaffectationClient(client, newConseiller);
	}

}

