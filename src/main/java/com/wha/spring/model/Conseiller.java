package com.wha.spring.model;

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

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@DiscriminatorValue("CONSEILLER")
public class Conseiller extends User{

	@Column(nullable=true, unique=true)
	private String matricule;
	
	 @OneToMany
	 private List<Client> listeClients ;
	
	 @OneToOne
	 private Client client;
	 //@OneToMany
	 //private List <DemandesClient> listDemandesClient;
	
	 @OneToMany
	 private List <DemandeOuverture> listeDemandeOuvertureAValider;
	@ManyToOne
	@JoinColumn(name="id_admin")
	private  Administrateur administrateur;
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
