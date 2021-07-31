package br.com.leandro.pessoa;

import java.util.ArrayList;

public class testePessoa {
	
	//1237017001

	public static void main(String[] args) {
		pessoa xico = new pessoa();
		// objeto pessoa na variável xico recebe espaço na memoria
		xico.setNome("Xico");
		xico.setAltura(1.8f);
		xico.setIdade(18);

		pessoa lucas = new pessoa();
		lucas.setNome("Lucas");
		lucas.setAltura(1.7f);
		lucas.setIdade(28);

		System.out.println(xico.toString());
		System.out.println(lucas.toString());
		
		ArrayList lista = new ArrayList();
		for (int i = 0; i < 9999; i++) {
			pessoa p = new pessoa();
			p.setNome("Nome:"+i);
			lista.add(p);
			
		}
 
	}

}
