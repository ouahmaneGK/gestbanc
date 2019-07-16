package com.wha.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wha.spring.iservice.AdminService;
import com.wha.spring.iservice.UserService;
import com.wha.spring.model.Administrateur;
import com.wha.spring.model.User;

@RestController
@RequestMapping("administrateurs")
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	@RequestMapping(value = "/create/dummy", method = RequestMethod.GET)
	public Administrateur dummy() {
		Administrateur a1 = new Administrateur(0, "kkk", "llllll", "lllll@oooo", "uuuuuu", "0124587", "oooo", "12547");
		//Administrateur a2 = new Administrateur(null, null);
		//Administrateur a3 = new Administrateur(null, null);
		adminService.saveAdministrateur(a1);
		//adminService.saveAdministrateur(a2);
		//adminService.saveAdministrateur(a3);
		return a1;
	}
	
	//@CrossOrigin(origins = "http://localhost:4200")
		@PostMapping("/create")
		public User createUser(@RequestBody Administrateur administrateur) {
			Administrateur newAdmin = adminService.saveAdministrateur(administrateur);
			return newAdmin;
		}
	

}
