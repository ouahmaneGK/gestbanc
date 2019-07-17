package com.wha.spring.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import javax.persistence.OneToMany;

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
@Table(name = "Compte")
public class Compte {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "NUMEROCOMPTE", nullable = false)
	private String numeroDeCompte;
	
	@Column(name = "RIB", nullable = false)
	private String RIB;
	
	@Column(name = "SOLDE", nullable = false)
	private double solde;
	
	@Column(name = "DECOUVERT", nullable = false)
	private double  decouvert;
	
	@Column(name = "MONTANTAGIOS", nullable = false)
	private double  montantAgios;
	
	@Column(name = "SEUILREMUNERATION", nullable = false)
	private double  seuilRemuneration;
	
	@Column(name = "MONTANTREMUNERATION", nullable = false)
	private double  montantRemuneration;
	
	/*@ManyToOne()
	private Client  client;
	
	@OneToMany
	private List <Transaction> listeTransactions;
	
	@OneToMany
	private List <Notification> listeNotifications;*/

}
