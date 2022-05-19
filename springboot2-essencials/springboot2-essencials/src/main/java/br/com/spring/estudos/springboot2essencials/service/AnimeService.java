package br.com.spring.estudos.springboot2essencials.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import br.com.spring.estudos.springboot2essencials.domain.Anime;
import br.com.spring.estudos.springboot2essencials.exception.BadRequestException;
import br.com.spring.estudos.springboot2essencials.mapper.AnimeMapper;
import br.com.spring.estudos.springboot2essencials.repository.AnimeRepository;
import br.com.spring.estudos.springboot2essencials.request.AnimePostRequestBody;
import br.com.spring.estudos.springboot2essencials.request.AnimePutRequestBody;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AnimeService {

