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
import com.wha.spring.iservice.CompteService;
import com.wha.spring.model.Compte;

@RestController
@RequestMapping("comptes")
public class CompteController {

	@Autowired
	CompteService compteService;

/*	@RequestMapping(value = "/create/trump", method = RequestMethod.GET)
	public void trump() {
		Compte cpte1 = new Compte(0, "03020306091", "00030200123010235489510", 251, 1500, 42, 5000,1);
		compteService.saveCompte(cpte1);
	}

		//Compte cpte1 = new Compte(0, "03020306091", "00030200123010235489510", 251, 1500, 42, 5000,1);
		Compte c1 =new Compte(0, "1111111111", " 55555op", 5000, 200, 100, 6000, 50, null);
		Compte c2 =new Compte(0, "1111111111", " 55555op", 5000, 200, 100, 6000, 50, null);
		Compte c3 =new Compte(0, "1111222211", " 655op", 40000, 6000, 500, 7000, 20, null);
		compteService.saveCompte(c1);
		compteService.saveCompte(c2);
		compteService.saveCompte(c3);
	}
     */

	//@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/create")
	public Compte createCompte(@RequestBody Compte compte) {
		Compte newCompte = compteService.saveCompte(compte);
		return newCompte;
	}

	//@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping("/update")
	public Compte updateCompte(@RequestBody Compte compte) {
		compteService.updateCompte(compte);
		return compte;
	}
	
	//@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping("/delete/{id}")
	public void deleteCompte(@PathVariable int id) {
		compteService.deleteCompte(id);
	}
	
	//@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "/get/compte/{id}", method = RequestMethod.GET)
	public Compte findById(@PathVariable int id) {
		 Compte compte = compteService.findById(id);
		 return compte;
	}

	//@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "/get/all", method = RequestMethod.GET)
	public ResponseEntity<List<Compte>> getAll() {
		List<Compte> resultat = compteService.findAllComptes();
		return new ResponseEntity<List<Compte>>(resultat, HttpStatus.OK);
	}
	
	//methode de modification de remuniration declarer dans l'entité conseillé du diagramme de classe
	@RequestMapping(value = "/modif/remuniration/{idCompte}/{montant}", method = RequestMethod.GET)
	public Compte modificationRemuniration(@PathVariable int  idCompte, @PathVariable int montant){
		Compte cpte =compteService.findById(idCompte);
		cpte.setSeuilRemuneration(montant);
		return cpte;
		
	}
}