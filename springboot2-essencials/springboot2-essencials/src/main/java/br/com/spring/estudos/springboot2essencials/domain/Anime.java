package br.com.spring.estudos.springboot2essencials.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Anime {
	private Long id;
	private String name;
}

//@Data do longbok vai gerar os getters, setters, equal, hashcode e etc... 

//Vamos utilizar a anotação @Entity para informar que uma classe representa uma entidade e que seus objetos devem ser persistidos no banco de dados

