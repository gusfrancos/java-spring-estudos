package br.com.estudos.springboot2.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import br.com.estudos.springboot2.domain.Anime;
import br.com.estudos.springboot2.repository.AnimeRepository;

@Service
public class AnimeService_V1 {
	private static List<Anime> animes;

    static {
        animes = new ArrayList<>(List.of(new Anime(1L, "Boku No Hero"), new Anime(2L, "Berserk")));
    }
	 
	
	public List<Anime> listAll(){
		return animes;
	}
	
	public Anime findById(long id){
		return animes.stream()
				.filter(anime -> anime.getId().equals(id))
				.findFirst()
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Anime ID not found"));
	}
	
	public Anime save(Anime anime) {
        anime.setId(ThreadLocalRandom.current().nextLong(3, 100000));
        animes.add(anime);
        return anime;
    }
	
	public void delete(long id) {
        animes.remove(findById(id));
    }
	
	public void replace(Anime anime) {
        delete(anime.getId());
        animes.add(anime);
    }
		
	
	
}

/**A anotação @Service representa esta classe como se fosse um serviço. 
 * Já as anotações @Autowired permitem que o Spring injete as dependências nesta classe
 */
