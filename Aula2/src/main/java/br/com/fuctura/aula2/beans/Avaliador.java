package br.com.fuctura.aula2.beans;

import org.apache.commons.rng.UniformRandomProvider;
import org.apache.commons.rng.simple.RandomSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Qualifier("Avaliador")
@Component
public class Avaliador implements Atividade {
	
	@Autowired
	private Atividade at1;
	@Autowired
	private Atividade at2;
	
	private UniformRandomProvider rng = RandomSource.WELL_512_A.create();;

	
	public void avaliar() {
		at1.questao("Questão 1");
		at2.questao("Questão 2");
		var nota = gerarNotaAleatoria();
		System.out.println("Sua nota foi: " + nota);
	}
	
	  public int gerarNotaAleatoria() {
	        return 1 + rng.nextInt(10);
	    }

	@Override
	public void questao(String enuciado) {
		// TODO Auto-generated method stub
		
	}
	
}
