package br.com.ap3.u1.ex3.leandroFreire2020010500;

import java.util.Scanner;

public class CriarCarros {
	public static void main(String[] args) {
		String modelo = "";
		String cor = "";
		int ano = 0;
		String marca = "";
		int nrDeModelosMarca = 0;
		int anoDeLancamentoMarca = 0;
		int codigoIdentificadorMarca = 0;
		int chassi = 0;
		float velocidadeMaxima = 0;
		float velocidadeAtual = 0;
		int numDePortas = 0;
		String temTetoSolar = "";
		int numDeMarchas = 0;
		String temCambioAutomatico = "";
		float volumeMaximoCombustivel = 0;
		

		Scanner entrada = new Scanner(System.in);
	for(int i = 1; i < 4; i ++) {
		
			System.out.println("Insira as especificações do carro " +i+ "\n");
			
			System.out.println("Modelo: ");
			modelo = entrada.next();
			
			
			System.out.println("Cor: ");
			cor = entrada.next();
			
			
			System.out.println("Ano: ");
			ano = entrada.nextInt();
			
			
			System.out.println("Marca: ");
			marca = entrada.next();
			
			
			System.out.println("Número de modelos: ");
			nrDeModelosMarca = entrada.nextInt();
			
			
			System.out.println("Ano de lançamento: ");
			anoDeLancamentoMarca = entrada.nextInt();
			
			
			System.out.println("Código identificador: ");
			codigoIdentificadorMarca = entrada.nextInt();
			
			
			System.out.println("Chassi: ");
			chassi = entrada.nextInt();
			
			
			System.out.println("Velocidade máxima: ");
			velocidadeMaxima = entrada.nextFloat();
			
			
			System.out.println("Velocidade atual: ");
			velocidadeAtual = entrada.nextFloat();
			
			
			System.out.println("Número de portas: ");
			numDePortas = entrada.nextInt();
			
			
			System.out.println("Teto solar: ");
			temTetoSolar = entrada.next();
			
			
			System.out.println("Número de marchas: ");
			numDeMarchas= entrada.nextInt();
			
			
			System.out.println("Câmbio automático: ");
			temCambioAutomatico = entrada.next();
			
			
			System.out.println("Volume máximo de combustível: \n");
			volumeMaximoCombustivel = entrada.nextFloat();
			
			Carro carro  = new Carro(modelo, cor, ano, new MarcaDeUmCarro (marca, nrDeModelosMarca, anoDeLancamentoMarca, codigoIdentificadorMarca), chassi, velocidadeMaxima, velocidadeAtual,  numDePortas, temTetoSolar, numDeMarchas, temCambioAutomatico,
					 volumeMaximoCombustivel);
			
			System.out.println(carro + "\n");
	}
			
			
			
			
			entrada.close();
	
			
			
			
		
		
	}

}
