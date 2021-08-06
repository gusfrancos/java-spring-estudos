package br.com.estudos.springboot2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.estudos.springboot2.domain.Anime;
import br.com.estudos.springboot2.repository.AnimeRepository;

@Service
public class AnimeService {
	//private final AnimeRepository animeRepository;
	
	public List<Anime> listAll(){
		return List.of(new Anime(1L,"DBZ"), new Anime(2L,"Berserk")); 
	}
}

/**A anotação @Service representa esta classe como se fosse um serviço. 
 * Já as anotações @Autowired permitem que o Spring injete as dependências nesta classe
 */
