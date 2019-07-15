package com.wha.spring.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
@Table(name = "CLIENT")
public class Client extends User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "REVENUMENS", nullable = false)
	private double revenuMens;
	
	@Column(name = "CONSEILLER", nullable = false)
	private String conseiller;
	
	/*@OneToMany
	private List <Compte> listeComptes [];
	private String piecesJustif;*/
	
}
