package com.wha.spring.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
@DiscriminatorValue("CONSEILLER")
public class Conseiller extends User {

	  	@Column(nullable = true, unique = true)
	    private String matricule;

	    @OneToMany(mappedBy = "conseiller")
	    @JsonIgnore
	    private List<Client> listeClients;

	    // @OneToMany
	    // private List <DemandesClient> listDemandesClient;

	    @OneToMany(mappedBy = "conseiller")
	    @JsonIgnore
	    private List<DemandeOuverture> listeDemandeOuvertureAValider;

	    @ManyToOne
	    @JsonIgnore
	    private Administrateur administrateur;	
	
	
		@Builder
		public Conseiller(int id, String nom, String prenom, String email,
				String adresse, String telephone, String pseudo, String mdp) {
			super(id, nom, prenom, email, adresse, telephone, pseudo, mdp);
			
			this.matricule= matricule;
	
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

