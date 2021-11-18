package br.com.ap3.u2.leandroFreire2020010500;


public class Agenda {
	
	private Contato[] contatos;
	
	public Agenda(){
		contatos = new Contato[50];
	}
	
	public void adicionarContato(Contato c) throws AgendaCheiaException{
		
		boolean cheia = true;
		
		for (int i = 0; i < contatos.length; i++){
			if (contatos[i] == null){
				contatos[i] = c;
				cheia = false;
				break;
			}
		}
		
		if(cheia){
			
			throw new AgendaCheiaException();
				
			}
			
		}
	
	public int consultaContatoPorNome(String nome) throws ContatoInexistenteException{
		
		for (int i = 0; i < contatos.length; i++) {
			
			if(contatos[i] != null) {
				
				if(contatos[i].getNome().equalsIgnoreCase(nome)) {
				
					return i;
			}
			
		}
			
	}
			
		throw new ContatoInexistenteException(nome);
		
	}

	public String toString() {
		String s = "";
			for(Contato c : contatos) {
				if(c != null) {
					s += c.toString() + "\n";
				}
			
			}
		return s;
	}

}
