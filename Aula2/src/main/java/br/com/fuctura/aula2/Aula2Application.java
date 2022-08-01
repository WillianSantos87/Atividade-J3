package br.com.fuctura.aula2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import br.com.fuctura.aula2.beans.Avaliador;
import br.com.fuctura.aula2.config.ServiceConfig;

@SpringBootApplication
public class Aula2Application {

	public static void main(String[] args) {
		//Execute o método avaliar() da Classe Avaliador.
		
		var contexto = new AnnotationConfigApplicationContext(ServiceConfig.class);
		
		var avaliador = contexto.getBean(Avaliador.class);
		
		avaliador.avaliar();
	}

}
