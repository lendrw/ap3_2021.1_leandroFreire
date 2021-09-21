package br.com.ap3.u1.ex3.leandroFreire2020010500;

/*Escreva uma classe em Java que tem como atributo o nome e a idade de uma pessoa. 
 * Faça uma outra classe com o método main(), 
 * na qual o usuário deverá preencher os dados da pessoa. 
 * Exiba o nome e quantos dias a pessoa viveu. Considere sempre anos completos, 
 * e que um ano possui 365 dias. Ex: uma pessoa com 19 anos possui 6935 dias de vida, 
 * então a saida seria: Joaninha, você viveu 6935 dias. 
 * Lembre-se que estamos em uma disciplina sobre orientação a objetos...
 * 
 * 
 * */
public class Pessoa {
	int idade = 0;
	String nome;

	public Pessoa(int idade, String nome) {
		super();
		this.idade = idade;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getDiasDeVida() {
		return this.idade*365;
	}

	public String toString() {
		String retorno = "";
		   retorno += nome + ", você viveu " + getDiasDeVida() + " dias.";
		   return retorno;
	}
}
