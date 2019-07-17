package com.wha.spring.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClientPotentiel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	private String prenom; 
	private String email;
	private String addresse;
	private String telephone;
	private int revenuMens;
	private String piecesJustif;
	
	@OneToOne(cascade=CascadeType.ALL)
	private DemandeOuverture demandeOuverture;

}
