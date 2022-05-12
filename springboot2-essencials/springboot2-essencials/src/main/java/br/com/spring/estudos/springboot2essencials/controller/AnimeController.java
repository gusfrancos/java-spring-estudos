package br.com.spring.estudos.springboot2essencials.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.spring.estudos.springboot2essencials.domain.Anime;
import br.com.spring.estudos.springboot2essencials.service.AnimeService;
import br.com.spring.estudos.springboot2essencials.util.DateUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("animes")
@Log4j2
@RequiredArgsConstructor
public class AnimeController {
	private static final Logger LOGGER = LoggerFactory.getLogger(AnimeController.class);
	
	// Primeira forma de fazer é com autowired sem constructor
	 
	@Autowired
	 private DateUtil dateUtil;
	
	
	 private final AnimeService animeService;
	 
	@GetMapping
	public ResponseEntity<List<Anime>> list(){
	 	log.info(dateUtil.formatLocalDateTimeYoDataBaseStyle(LocalDateTime.now()));
	    return ResponseEntity.ok(animeService.listAll());
	}
	
	 @GetMapping(path = "/{id}")
	public ResponseEntity<Anime> findById(@PathVariable long id){
	    return ResponseEntity.ok(animeService.findById(id));
	}

	   
}
