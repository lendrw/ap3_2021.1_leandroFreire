package br.com.ap3.u1.ex3.leandroFreire2020010500;

/*
 * O atributo Marca de um carro deve ser uma classe separada, com nome, 
 * nrDeModelos, ano de lançamento e código identificador
 * */

public class MarcaDeUmCarro {

	String nome;
	int nrDeModelos;
	int anoDeLancamento;
	int codigoIdentificador;
	
	public MarcaDeUmCarro(String nome, int nrDeModelos, int anoDeLancamento, 
													int codigoIdentificador) {
		super();
		this.nome = nome;
		this.nrDeModelos = nrDeModelos;
		this.anoDeLancamento = anoDeLancamento;
		this.codigoIdentificador = codigoIdentificador;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNrDeModelos() {
		return nrDeModelos;
	}

	public void setNrDeModelos(int nrDeModelos) {
		this.nrDeModelos = nrDeModelos;
	}

	public int getAnoDeLancamento() {
		return anoDeLancamento;
	}

	public void setAnoDeLancamento(int anoDeLancamento) {
		this.anoDeLancamento = anoDeLancamento;
	}

	public int getCodigoIdentificador() {
		return codigoIdentificador;
	}

	public void setCodigoIdentificador(int codigoIdentificador) {
		this.codigoIdentificador = codigoIdentificador;
	}


	public String toString() {
		String retorno = "";
		
		retorno += 
				"Marca: " +nome+ "\n" +
				"Quantidade de modelos: " +nrDeModelos+ "\n" +
				"Ano de lançamento: " +anoDeLancamento+ "\n" +
				"Código identificador: " +codigoIdentificador;
		
		return retorno;
	}

	
}
