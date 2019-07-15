package com.wha.spring.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Entity
@Getter
@AllArgsConstructor
@Table(name = "CLIENT")
public enum TypeRequete {
	CHEQUIER,
	MOTDEPASSE,
	DECOUVERT,
	REMUNIRATION;
	
	

}
