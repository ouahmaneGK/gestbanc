package com.wha.spring.model;

import java.util.List;

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
public class DemandeOuverture {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String clientPotentiel; 
	private boolean valide; 
	private List<Conseiller> conseiller; 
	
	@OneToOne(mappedBy="demandeOuverture")
	private ClientPotentiel clientpotentiel;
	

}
