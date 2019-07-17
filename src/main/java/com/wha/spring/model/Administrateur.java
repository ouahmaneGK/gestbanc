package com.wha.spring.model;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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

@DiscriminatorValue("ADMINISTRATEUR")
public class Administrateur extends User {
	
	@JsonIgnore
	@OneToMany(mappedBy="administrateur")
	private List<Conseiller> conseillers;


	@JsonIgnore

	@OneToMany
	private  List<DemandeOuverture> demandeOuverture;




	
}
