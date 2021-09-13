package br.com.ap3.u1.ex3.leandroFreire2020010500;

import java.util.Scanner;

/*Faça uma classe em Java que exiba a soma dos números inteiros digitados pelo usuário. 
 * Encerre a execução quando o usuário digitar um número negativo. 
 * Faça uma classe com o método main() que teste a funcionalidade.
 * 
 * 
 * 
 * */

public class SomaDeInteiros {
        
	public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        int valores, soma = 0;

        
        do{
            System.out.println("Digite um número");
            valores = entrada.nextInt(); // usuario digita um número
            
            if(valores >= 0){
                soma = valores + soma;
            }
        } while(valores >= 0); 
        
        System.out.println("A soma dos valores é: " + soma);
        
        entrada.close();
    }
}
