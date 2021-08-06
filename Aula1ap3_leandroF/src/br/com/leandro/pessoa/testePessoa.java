package br.com.leandro.pessoa;

import java.util.ArrayList;

public class TestePessoa {
	
	//1237017001

	public static void main(String[] args) {
		Pessoa xico = new Pessoa();
		// objeto pessoa na variável xico recebe espaço na memoria
		xico.setNome("Xico");
		xico.setAltura(1.8f);
		xico.setIdade(18);

		Pessoa lucas = new Pessoa();
		lucas.setNome("Lucas");
		lucas.setAltura(1.7f);
		lucas.setIdade(28);

		System.out.println(xico.toString());
		System.out.println(lucas.toString());
		
		ArrayList lista = new ArrayList();
		for (int i = 0; i < 9999; i++) {
			Pessoa p = new Pessoa();
			p.setNome("Nome:"+i);
			lista.add(p);
			
		}
 
	}

}
