package br.com.ap3.u2.leandroFreire2020010500;

import java.util.Scanner;

public class MesesDoAno {
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		int mes = 1;
		
		String[] meses = {"", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", 
				"Julho",  "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
		
		while(mes != 0) {
		System.out.println("Digite um número correspondente a um dos 12 meses ou zero para encerrar: ");
		
		try {
		
			String entrada = scan.nextLine();
			mes = Integer.parseInt(entrada);
			
			System.out.println("\n" + meses[mes] + "\n");
		
		}catch(NumberFormatException e) {
			System.err.println("\n Entrada inválida \n");
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("\n Entrada inválida \n");
		}
			
		}
		scan.close();
		
		
	}
	
}

			
		
