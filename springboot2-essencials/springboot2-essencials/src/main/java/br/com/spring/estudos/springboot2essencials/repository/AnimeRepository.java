package br.com.spring.estudos.springboot2essencials.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.spring.estudos.springboot2essencials.domain.Anime;

public interface AnimeRepository extends JpaRepository<Anime, Long> {
	 List<Anime> findByName(String name);

}
