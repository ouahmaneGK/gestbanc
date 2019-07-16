package com.wha.spring.model;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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

@DiscriminatorValue("ADMINISTRATEUR")
public class Administrateur extends User {
	
	
	@OneToMany(mappedBy="administrateur")
	private List<Conseiller> conseillers;
	
	@OneToMany
	private  List<DemandeOuverture> demandeOuverture;

	@Builder
	public Administrateur(int id, String nom, String prenom, String email,
			String adresse, String telephone, String pseudo, String mdp) {
		super(id, nom, prenom, email, adresse, telephone, pseudo, mdp);
		// TODO Auto-generated constructor stub
	}


	
}
