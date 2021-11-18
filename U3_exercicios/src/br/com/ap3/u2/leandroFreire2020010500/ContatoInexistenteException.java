package br.com.ap3.u2.leandroFreire2020010500;

public class ContatoInexistenteException extends Exception{
	
	private String nomeContato;

	public ContatoInexistenteException(String nomeContato) {
		this.nomeContato = nomeContato;
	}

	public String getMessage() {
		return "O contato " + nomeContato.toUpperCase() + " não existe na agenda.";
	}

	
}