package com.wha.spring.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Administrateur {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	//private List<Conseiller> conseiller;
	private  List<DemandeOuverture> demande;
	
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
