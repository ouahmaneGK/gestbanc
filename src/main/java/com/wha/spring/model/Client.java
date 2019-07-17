package com.wha.spring.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
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
@DiscriminatorValue("CLIENT")
public class Client extends User {
	
	//@Column(nullable=false, unique=true)
	//private int identifiant;
	
	@Column(name = "REVENUMENS", nullable = true)
	private double revenuMens;
	
	@ManyToOne
	private Conseiller conseiller;
	
	/*@OneToMany
	private List <Compte> listeComptes [];
	private String piecesJustif;*/
	
}
