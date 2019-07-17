package com.wha.spring.model;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.wha.spring.model.Client.ClientBuilder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@DiscriminatorValue("Credit")
public class Credit extends Transaction {
	
	
	@Builder
	public Credit(int id, int montant, Compte compte, String libelle, Date date){
		super(0, montant, compte, libelle, date);
	}
}
