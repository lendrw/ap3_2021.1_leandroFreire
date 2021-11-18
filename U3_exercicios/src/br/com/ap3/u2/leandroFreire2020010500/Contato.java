package br.com.ap3.u2.leandroFreire2020010500;

/*
 * @author leandro
 */

public class Contato {

	private static int contador;
	
	private int id;
	private String nome;
	private String telefone;
	
	
	public Contato(){
		contador++;
		id = contador;
	}


	public int getId() {
		return id;
	}

	public String toString() {
		String s = "[";
		
		s += "Id: " + id;
		s += ", Nome: " + nome;
		s += ", Telefone: " + telefone;
		s += "]";
		
		return s;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


}
