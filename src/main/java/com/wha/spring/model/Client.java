package com.wha.spring.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@DiscriminatorValue("CLIENT")
public class Client extends User {
	
	//@Column(nullable=false, unique=true)
	//private int identifiant;
	
	@Column(name = "REVENUMENS", nullable = true)
	private double revenuMens;
	
	@OneToOne(mappedBy="client")
	private Conseiller conseiller;
	
	@Builder
	public Client(String nom, String prenom, String email,
			String adresse, String telephone, String pseudo, String mdp, double revenuMens, Conseiller conseiller) {
		super(0, nom, prenom, email, adresse, telephone, pseudo, mdp);
		this.revenuMens = revenuMens;
		this.conseiller = conseiller;
	}
	
	/*@OneToMany
	private List <Compte> listeComptes [];
	private String piecesJustif;*/
	
}
