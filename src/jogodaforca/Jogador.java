package jogodaforca;

//HERANÇA -> EXTENDS PESSOA
public class Jogador extends Pessoa { 
	
	

	private int chances = 6; //verificar!!
	private int erros = 0; //verificar!!
	
	
	
	// METODOS ESPECIAIS

	public int getChances() {
		return chances;
	}
	public void setChances(int chances) {
		this.chances = chances;
	}
	public int getErros() {
		return erros;
	}
	public void setErros(int erros) {
		this.erros = erros;
	}

	

	
	
}
