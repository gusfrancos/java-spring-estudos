package br.com.estudos.springboot2.repository;

import java.util.List;

import br.com.estudos.springboot2.domain.Anime;

public interface AnimeRepository {
	List<Anime> listAll();
}
