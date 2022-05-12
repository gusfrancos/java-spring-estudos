package br.com.spring.estudos.springboot2essencials.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Component;

//@component transforma a classe em um bean
//@Service e repository tem objetivos semelhantes que o @Component
@Component
public class DateUtil {
	public String formatLocalDateTimeYoDataBaseStyle(LocalDateTime localDateTime) {
		return DateTimeFormatter.ofPattern("yyy-MM-dd HH:mm:ss").format(localDateTime);
		
	}
}

/**@Component
Anotação genérica para qualquer componente gerenciado pelo Spring. 
Esta anotação faz com que o bean registrado no Spring possa ser utilizado em qualquer bean, seja ele um serviço, um DAO, um controller, etc. 
No nosso exemplo, ele será responsável por um Bean que representa uma entidade.
*/

/**A anotação @Service representa esta classe como se fosse um serviço. 
* Já as anotações @Autowired permitem que o Spring injete as dependências nesta classe
*/

/**
* Repository e Configuração do Spring. Repository (em português, repositório) 
* é um padrão de projeto descrito no livro Domain-Driven Design (DDD) de Eric Vans. 
* É um conceito muito semelhante ao padrão de projeto DAO, já que seu foco também é
*  a camada de persistência de dados de uma aplicação.
*/  
