package jogodaforca;

//HERANÇA -> EXTENDS PESSOA
public class Jogador extends Pessoa { 
	
	private int erros;
	private int acertou = 0;
	private int chances = 6;
	
	// METODOS ESPECIAIS
	public int getErros() {
		return erros;
	}
	public void setErros(int erros) {
		this.erros = erros;
	}
	public int getAcertou() {
		return acertou;
	}
	public void setAcertou(int acertou) {
		this.acertou = acertou;
	}
	public int getChances() {
		return chances;
	}
	public void setChances(int chances) {
		this.chances = chances;
	}	
	
}
