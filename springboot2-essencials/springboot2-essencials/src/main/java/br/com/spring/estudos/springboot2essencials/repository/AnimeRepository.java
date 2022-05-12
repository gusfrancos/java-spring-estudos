package br.com.spring.estudos.springboot2essencials.repository;

import java.util.List;

import br.com.spring.estudos.springboot2essencials.domain.Anime;

public interface AnimeRepository {
    List<Anime> listAll();
}
