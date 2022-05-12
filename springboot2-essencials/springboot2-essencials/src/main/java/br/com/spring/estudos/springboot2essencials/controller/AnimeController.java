package br.com.spring.estudos.springboot2essencials.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.spring.estudos.springboot2essencials.domain.Anime;
import br.com.spring.estudos.springboot2essencials.util.DateUtil;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("animes")
@RequiredArgsConstructor
public class AnimeController {
	private static final Logger LOGGER = LoggerFactory.getLogger(AnimeController.class);

	// Primeira forma de fazer é com autowired sem constructor
	 //@Autowired
	 private DateUtil dateUtil;
	 //private final AnimeService animeService;
	 
	@GetMapping
	public List<Anime> list(){
		LOGGER.info(dateUtil.formatLocalDateTimeYoDataBaseStyle(LocalDateTime.now()));
		
		//return List.of(new Anime(1L, "Boku no Hero"), new Anime(2L, "Beserk"));
		//return animeService.listAll();
		return null;
	}
	
	

}
