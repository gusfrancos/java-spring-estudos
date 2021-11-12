package br.com.estudos.springboot2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.estudos.springboot2.domain.Anime;

public interface AnimeRepository extends JpaRepository<Anime, Long> {

}
