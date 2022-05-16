package br.com.spring.estudos.springboot2essencials.request;

import lombok.Data;

@Data
public class AnimePutRequestBody {
    private Long id;
    private String name;
}
