package jogodaforca;

//HERANÇA -> EXTENDS PESSOA
public class Jogador extends Pessoa { 
	
	private int erros;
	private int acertou = 0;
	private int chances = 6;
	
	protected void Boneco (){
		if (getErros() == 1) {
			System.out.print("\n");
			System.out.println("          O          ");
			System.out.print("\n");
		} 
		if (getErros() == 2) {
			System.out.print("\n");
			System.out.println("          O          ");
			System.out.println("          |          ");
			System.out.println("          |          ");
			System.out.print("\n");
		}
		if (getErros() == 3) {
			System.out.print("\n");
			System.out.println("       ___O          ");
			System.out.println("          |          ");
			System.out.println("          |          ");
			System.out.print("\n");
		}
		if (getErros() == 4) {
			System.out.print("\n");
			System.out.println("        __O__       ");
			System.out.println("          |         ");
			System.out.println("          |         ");
			System.out.print("\n");
			
		}
		if (getErros() == 5) {
			System.out.print("\n");
			System.out.println("        __O__       ");
			System.out.println("          |         ");
			System.out.println("          |         ");
			System.out.println("         |          ");
			System.out.print("\n");
		}
		if (getErros() == 6) {
			System.out.print("\n");
			System.out.println("        __O__        ");
			System.out.println("          |          ");
			System.out.println("          |          ");
			System.out.println("         | |         ");
			System.out.print("\n");
		}
	}
	
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
