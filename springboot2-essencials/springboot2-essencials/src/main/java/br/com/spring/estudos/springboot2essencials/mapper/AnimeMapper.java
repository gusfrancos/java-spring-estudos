package br.com.spring.estudos.springboot2essencials.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import br.com.spring.estudos.springboot2essencials.domain.Anime;
import br.com.spring.estudos.springboot2essencials.request.AnimePostRequestBody;
import br.com.spring.estudos.springboot2essencials.request.AnimePutRequestBody;

@Mapper(componentModel = "spring")
public abstract class AnimeMapper {	
	
	public static final AnimeMapper INSTANCE = Mappers.getMapper(AnimeMapper.class);
	
	public abstract Anime toAnime(AnimePostRequestBody animePostRequestBody);
	
	public abstract Anime toAnime(AnimePutRequestBody animePutRequestBody);

}
