package br.com.ap3.u1.ex3.leandroFreire2020010500;

/*
 * Implemente uma classe Carro, com os seguintes atributos na classe: 
 * modelo, cor, ano, marca, chassi, velocidade m�xima, velocidade atual, num de portas, 
 * tem teto solar?, num marchas, tem c�mbio autom�tico?, 
 * volume de combust�vel que cabem no tanque.
 * 
 * 
 * Implemente o m�todo acelera, que aumenta a velocidade de 1 em 1 km/h. 
 * Ou aumenta a velocidade conforme par�metro
 * 
 * 
 * Implemente o m�todo freia, que para o carro (velocidade = 0 km/h)
 * 
 * 
 * Implemete o m�todo troca marcha
 * 
 * 
 * Implemente o m�todo reduz a marcha
 * 
 * 
 * A marcha r� nao pode ser engatada se o a velocidade for superior a 0 km/h
 * 
 * 
 * 
 * 
 * Implemente um m�todo que calcule a autonomia de viagem do ve�culo com base no consumo 
 * m�dio passado como par�metro
 * 
 * 
 * */

public class Carro {
	

	String modelo;
	String cor;
	int ano;
	MarcaDeUmCarro marca;
	int chassi;
	float velocidadeMaxima;
	float velocidadeAtual;
	int numDePortas;
	String temTetoSolar;
	int numDeMarchas;
	String temCambioAutomatico;
	float volumeMaximoCombustivel;

	public Carro(String modelo, String cor, int ano, MarcaDeUmCarro marca, int chassi, float velocidadeMaxima,
			float velocidadeAtual, int numDePortas, String temTetoSolar, int numDeMarchas, String temCambioAutomatico,
			float volumeMaximoCombustivel) {
		super();
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		this.marca = marca;
		this.chassi = chassi;
		this.velocidadeMaxima = velocidadeMaxima;
		this.velocidadeAtual = velocidadeAtual;
		this.numDePortas = numDePortas;
		this.temTetoSolar = temTetoSolar;
		this.numDeMarchas = numDeMarchas;
		this.temCambioAutomatico = temCambioAutomatico;
		this.volumeMaximoCombustivel = volumeMaximoCombustivel;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public MarcaDeUmCarro getMarca() {
		return marca;
	}

	public void setMarca(MarcaDeUmCarro marca) {
		this.marca = marca;
	}

	public int getChassi() {
		return chassi;
	}

	public void setChassi(int chassi) {
		this.chassi = chassi;
	}

	public float getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(float velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public float getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(float velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public int getNumDePortas() {
		return numDePortas;
	}

	public void setNumDePortas(int numDePortas) {
		this.numDePortas = numDePortas;
	}

	public String isTemTetoSolar() {
		return temTetoSolar;
	}

	public void setTemTetoSolar(String temTetoSolar) {
		this.temTetoSolar = temTetoSolar;
	}

	public int getNumDeMarchas() {
		return numDeMarchas;
	}

	public void setNumDeMarchas(int numDeMarchas) {
		this.numDeMarchas = numDeMarchas;
	}

	public String isTemCambioAutomatico() {
		return temCambioAutomatico;
	}

	public void setTemCambioAutomatico(String temCambioAutomatico) {
		this.temCambioAutomatico = temCambioAutomatico;
	}

	public float getVolumeMaximoCombustivel() {
		return volumeMaximoCombustivel;
	}

	public void setVolumeMaximoCombustivel(float volumeMaximoCombustivel) {
		this.volumeMaximoCombustivel = volumeMaximoCombustivel;
	}

	public String Acelera() {
		
		this.velocidadeAtual = velocidadeAtual++;
		return "A velocidade atual est� em " +velocidadeAtual+ " o carro acelerou em 1km/h.";

	}

	public String Freia() {

		this.velocidadeAtual = 0;
		return "A velocidade atual est� em " +velocidadeAtual+ ", o carro freiou.";
	}

	public String toString() {
		
		String retorno = "";
		retorno += "Modelo: "+modelo+ "\n" +
				"Cor: " +cor+ "\n" +
				
				"Ano: " +ano+ "\n" +
				
				"Marca: " +marca+ "\n" +
				
				"Chassi: " +chassi+ "\n" +
				
				"Velocidade m�xima: " +velocidadeMaxima+ "\n" +
				
				"Velocidade atual: " +velocidadeAtual+ "km/h\n" +
				
				"N�mero de portas: " +numDePortas+ "km/h\n" +
				
				"Teto solar: "+temTetoSolar+ "\n" +
				
				"N�mero de marchas: " +numDeMarchas+ "\n" +
				
				"C�mbio autom�tico: "+temCambioAutomatico+ "\n" +
				
				"Volume m�ximo de combust�vel: "+volumeMaximoCombustivel;
		
		
		return retorno;
	}
	
	


	
}
