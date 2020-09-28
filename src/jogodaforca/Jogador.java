package jogodaforca;

//HERANÇA -> EXTENDS PESSOA
public class Jogador extends Pessoa { 
	
	private int erros; 	
	
	// METODOS ESPECIAIS
	
	public int getErros() {
		return erros;
	}
	public void setErros(int erros) {
		this.erros = erros;
	}	
	
}
