package br.com.estudos.springboot2.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Anime {
	private Long id;
	private String name;
}

//@Data do longbok vai gerar os getters, setters, equal, hashcode e etc... 
