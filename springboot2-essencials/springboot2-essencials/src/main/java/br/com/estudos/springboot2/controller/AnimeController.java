package br.com.estudos.springboot2.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.estudos.springboot2.domain.Anime;
import br.com.estudos.springboot2.util.DateUtil;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;


@RestController
@RequestMapping("anime")
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
	
	@GetMapping(path = "list")
	public List<Anime> list(){
		log.info(dateUtil.formatLocalDateTimeYoDataBaseStyle(LocalDateTime.now()));
		return List.of(new Anime("DBZ"), new Anime("Berserk"));
	}
	
	@GetMapping(path = "list2")
	public List<Anime> list2(){
		log.info(dateUtil.formatLocalDateTimeYoDataBaseStyle(LocalDateTime.now()));
		return List.of(new Anime("One Piece"), new Anime("Berserk"), new Anime("hdhfhf"));
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




