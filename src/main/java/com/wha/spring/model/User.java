package com.wha.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "User")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "NOM", nullable = true)
	private String nom;
	
	@Column(name = "PRENOM", nullable = true)
	private String prenom;
	
	@Column(name = "EMAIL", nullable = true)
	private String email;
	
	@Column(name = "ADRESSE", nullable = true)
	private String adresse;
	
	@Column(name = "TELEPHONE", nullable = true)
	private String telephone;
	
	@Column(name = "PSEUDO", nullable = true)
	private String pseudo;
	
	@Column(name = "MDP", nullable = true)
	private String mdp;

	
}
