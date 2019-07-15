package com.wha.spring.model;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Conseiller {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String matricule;
	
	//@OneToMany
	//private List<Client> listeClients ;
	
	//@OneToMany
	//private List <DemandesClient> listDemandesClient;
	
	//@OneToMany
	//private List <DemandeOuverture> listeDemandeOuvertureAValider;
	
	
	/*public void modificationDecouvert(){
		
		
	}
	
	public void modificationReminiration(){
		
	}
	
   public void validerDemandeChequier(){
	   
   }
   
   public void validationDemandeOuverture(){
	   
   }
   
   public void gelerCompte(){
	   
   }
   public void rechercheParClient(){
	   
   }
   public void rechercheParCompte(){
	   
   }
   public void afficheDetail(){
	   
   }*/
   
}
