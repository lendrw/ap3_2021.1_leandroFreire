package br.com.ap3.u1.ex3.leandroFreire2020010500;

import java.util.Scanner;

public class DiasDeVidaPessoa {

	public static void main(String [] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira seu nome: ");
			String nome = entrada.next();
			
			
		System.out.println("Insira sua idade: ");
			int idade = entrada.nextInt();
			
				entrada.close();
			
				
		Pessoa novaPessoa = new Pessoa(idade, nome);
		
		System.out.println(novaPessoa);
	}
}
