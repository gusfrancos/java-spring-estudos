package br.com.estudos.springboot2.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import br.com.estudos.springboot2.domain.Anime;
import br.com.estudos.springboot2.exception.BadRequestException;
import br.com.estudos.springboot2.mapper.AnimeMapper;
import br.com.estudos.springboot2.repository.AnimeRepository;
import br.com.estudos.springboot2.requests.AnimePostRequestBody;
import br.com.estudos.springboot2.requests.AnimePutRequestBody;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AnimeService {

    private final AnimeRepository animeRepository;

    public List<Anime> listAll() {
        return animeRepository.findAll();
    }
    
    public List<Anime> findByName(String name) {
        return animeRepository.findByName(name);
    }

    public Anime findByIdOrThrowBadRequestException(long id) {
        return animeRepository.findById(id)
                .orElseThrow(() -> new BadRequestException("Anime not Found"));
    }
    
//    public Anime findByIdOrThrowBadRequestException(long id) {
//        return animeRepository.findById(id)
//                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Anime not Found"));
//    }

    //Caso vc precise de um rollback qdo acontecer um erro use  @Transactional
    //Se vc colocar esta anotation o spring não vai comitar esta trasação enquanto o método não terminar
    
    //Se a exceção for do tipo checked coloca o rollbackfor
    //@Transactional(rollbackFor = Exception.class)]
    
    @Transactional
    public Anime save(AnimePostRequestBody animePostRequestBody) {
        return animeRepository.save(AnimeMapper.INSTANCE.toAnime(animePostRequestBody));
    }

    public void delete(long id) {
        animeRepository.delete(findByIdOrThrowBadRequestException(id));
    }

    public void replace(AnimePutRequestBody animePutRequestBody) {
        Anime savedAnime = findByIdOrThrowBadRequestException(animePutRequestBody.getId());
        Anime anime = AnimeMapper.INSTANCE.toAnime(animePutRequestBody);
        anime.setId(savedAnime.getId());

        animeRepository.save(anime);
    }
}

/**A anotação @Service representa esta classe como se fosse um serviço. 
 * Já as anotações @Autowired permitem que o Spring injete as dependências nesta classe
 */
