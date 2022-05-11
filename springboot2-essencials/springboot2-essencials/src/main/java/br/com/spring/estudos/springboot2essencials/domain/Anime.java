package br.com.spring.estudos.springboot2essencials.domain;

import lombok.AllArgsConstructor;
import lombok.Data;



public class Anime {
	private Long id;
	private String name;
	
	
	public Anime(Long id, String name) {
		this.id = id;
		this.name = name;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}

//@Data do longbok vai gerar os getters, setters, equal, hashcode e etc... 

//Vamos utilizar a anotação @Entity para informar que uma classe representa uma entidade e que seus objetos devem ser persistidos no banco de dados

