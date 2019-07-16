package com.wha.spring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
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
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TypeUser", discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("TypeUser")
@Table(name = "User")
public class User implements Serializable{

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "NOM" )
	private String nom;
	
	@Column(name = "PRENOM" )
	private String prenom;
	
	@Column(name = "EMAIL" )
	private String email;
	
	@Column(name = "ADRESSE" )
	private String adresse;
	
	@Column(name = "TELEPHONE" )
	private String telephone;
	
	@Column(name = "PSEUDO" )
	private String pseudo;
	
	@Column(name = "MDP" )
	private String mdp;

	
}
