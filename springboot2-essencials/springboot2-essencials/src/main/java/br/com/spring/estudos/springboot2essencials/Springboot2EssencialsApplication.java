package br.com.spring.estudos.springboot2essencials;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.metrics.MeterRegistryCustomizer;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.micrometer.core.instrument.MeterRegistry;

@SpringBootApplication
//@ComponentScan(basePackages = "br.com.spring.estudos.springboot2essencials")
public class Springboot2EssencialsApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot2EssencialsApplication.class, args);
	}
	
	@Bean
	MeterRegistryCustomizer<MeterRegistry> configurer(
			@Value("${spring.application.name}") String applicationName) {
		return (registry) -> registry.config().commonTags("application", applicationName);
	}

}

//**** Atenção
//não esquece de instalar o pluging do lombok no eclipse, além de configurar as refêrencias
// não esquecer de habilitar no eclipse o campo: enable annotation processing

/**
* @EnableAutoConfiguration 
* A anotação diz ao Spring Boot para "adivinhar" como você deseja configurar o Spring, 
* com base nas dependências do jar que você adicionou. Por exemplo, se o HSQLDB estiver 
* no seu caminho de classe e você não tiver configurado manualmente nenhum bean de conexão 
* com o banco de dados, o Spring configurará automaticamente um banco de dados na memória.
@ComponentScan 
diz ao Spring para procurar outros componentes, configurações e serviços no pacote especificado. 
O Spring é capaz de verificar automaticamente, detectar e registrar seus beans 
ou componentes de um pacote de projeto predefinido. Se nenhum pacote for especificado, 
o pacote de classe atual será considerado o pacote raiz.
*/
