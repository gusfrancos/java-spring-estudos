package br.com.estudos.springboot2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import br.com.estudos.springboot2.domain.Anime;
import br.com.estudos.springboot2.repository.AnimeRepository;

@Service
public class AnimeService {
	private List<Anime> animes = List.of(new Anime(1L,"DBZ"), new Anime(2L,"Berserk")); 
	
	public List<Anime> listAll(){
		return animes;
	}
	
	public Anime findById(long id){
		return animes.stream()
				.filter(anime -> anime.getId().equals(id))
				.findFirst()
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Anime ID not found"));
	}
		
	
	
}

/**A anotação @Service representa esta classe como se fosse um serviço. 
 * Já as anotações @Autowired permitem que o Spring injete as dependências nesta classe
 */
