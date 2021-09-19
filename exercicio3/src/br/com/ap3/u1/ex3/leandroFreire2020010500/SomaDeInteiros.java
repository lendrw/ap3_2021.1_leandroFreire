package br.com.ap3.u1.ex3.leandroFreire2020010500;

import java.util.Scanner;

/*Fa�a uma classe em Java que exiba a soma dos n�meros inteiros digitados pelo usu�rio. 
 * Encerre a execu��o quando o usu�rio digitar um n�mero negativo. 
 * Fa�a uma classe com o m�todo main() que teste a funcionalidade.
 * 
 * 
 * 
 * */

public class SomaDeInteiros {
        
	public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        int valores, soma = 0;

        
        do{
            System.out.println("Digite um n�mero");
            valores = entrada.nextInt(); // usuario digita um n�mero
            
            if(valores >= 0){
                soma = valores + soma;
            }
        } while(valores >= 0); 
        
        System.out.println("A soma dos valores �: " + soma);
        
        entrada.close();
    }
}
