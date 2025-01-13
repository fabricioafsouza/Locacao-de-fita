package br.com.kca.api.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.Column;


@Entity
@Table(name="Filmes")
public class Filmes implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, length = 160)
	private Long id;
	
	
	@Column(nullable = false, length = 50)
	private char genero;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public char getGenero() {
		return genero;
	}


	public void setGenero(char genero) {
		this.genero = genero;
	}
	

}
