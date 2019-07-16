package com.wha.spring.model;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
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
	
//	public String creationConseiller(){
//		return listeConseillers;
//		
//	}
//	
//	public void supprimerConseiller(){
//		
//	}
//	
//	public String reaffectationClient(){
//		return ;
//			
//	}
//	
//	public String affectationDemandeOuverture(){
//		return ;
//		
//	}
	
	
	

}
