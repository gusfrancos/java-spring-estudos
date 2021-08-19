package br.com.estudos.springboot2.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.estudos.springboot2.domain.Anime;
import br.com.estudos.springboot2.service.AnimeService;
import br.com.estudos.springboot2.util.DateUtil;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;


@RestController
@RequestMapping("animes")
@Log4j2

//terceira forma de fazer é com @RequiredArgsConstructor (Ele cria um construtor com todos os campos que são finais)
@RequiredArgsConstructor
public class AnimeController {
	
	//Primeira forma de fazer é com autowired sem constructor
	//@Autowired
	//private DateUtil dateUtil;
	
	//Segunda forma de fazer é sem autowired e com constructor
//	private DateUtil dateUtil;
//	public AnimeController(DateUtil dateUtil) {
//		this.dateUtil = dateUtil;
//	}

	
	private final DateUtil dateUtil;
	private final AnimeService animeService;
	
	@GetMapping
	public ResponseEntity<List<Anime>> list(){
		log.info(dateUtil.formatLocalDateTimeYoDataBaseStyle(LocalDateTime.now()));
		//return animeService.listAll();
		
		//boa pratica: retornar o status desta requição
		//return new ResponseEntity<>(animeService.listAll(), HttpStatus.OK);
		
		
		//outra forma
		return ResponseEntity.ok(animeService.listAll());
	}
	
	
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<Anime> findById(@PathVariable long id){
		log.info(dateUtil.formatLocalDateTimeYoDataBaseStyle(LocalDateTime.now()));
		
		
		//boa pratica: retornar o status desta requição
		return new ResponseEntity<>(animeService.findById(id), HttpStatus.OK);
		
		
		//outra forma
		//return ResponseEntity.ok(animeService.listAll().get(id));
	}
	
//	@GetMapping(path = "list2")
//	public List<Anime> list2(){
//		log.info(dateUtil.formatLocalDateTimeYoDataBaseStyle(LocalDateTime.now()));
//		return List.of(new Anime("One Piece"), new Anime("Berserk"), new Anime("hdhfhf"));
//	}
	
	@PostMapping
    public ResponseEntity<Anime> save(@RequestBody Anime anime){
        return new ResponseEntity<>(animeService.save(anime), HttpStatus.CREATED);
    }
	
	@DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable long id) {
        animeService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
	
	//
	@PutMapping
    public ResponseEntity<Void> replace(@RequestBody Anime anime) {
        animeService.replace(anime);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
	
	
}


/**
 * => A anotação @RestController permite definir um controller com características REST;
 * => A anotação @Autowired delega ao Spring Boot a inicialização do objeto;
 * => A anotação @RequestMapping permite definir uma rota. Caso não seja informado o método HTTP da rota, ela será definida para todos os métodos.
 * => A anotação @PathVariable indica que o valor da variável virá de uma informação da rota;
 * => A anotação @RequestBody indica que o valor do objeto virá do corpo da requisição;
 * => E a anotação @Valid indica que os dados recebidos devem ser validados.
 */




