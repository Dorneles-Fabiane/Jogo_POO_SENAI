package jogodaforca;

import java.util.Random;
import java.util.Scanner;

public class Jogo extends Jogador{
	
	//VARIAVEIS
	private String[] palavras = {"AMOR", "CACHORRO", "CINEMA", "CASA", 
			"ALGORITMO", "SABADO", "PIPA"};

	Jogador jogador = new Jogador();
	private int index;
	private char letra;
	private String letrasUtilizadas = "";
	private String palavra;
	private char[] acertos;
	private int acertou = 0;
	private int chances = 6; //verificar!!
	
	
	//EXECUÇÃO
	public void executar() {
       
		palavra = geraPalavra();
		acertos = new char [getPalavra().length()];
		
		for (int c= 0; c < getPalavra().length(); c++) {
			acertos[c] = '_';
			System.out.print(acertos[c] + " ");
			} System.out.println("\n\n");
		
		
		while (chances > 0) {
		recebeletra();

			for (index = 0; index < getPalavra().length(); index++) {
				if(palavra.charAt(index) == letra) {
					acertos[index] = letra;
					acertou++;
				} 
			
				System.out.print(acertos[index] + " ");				
				
			}	if (palavra.indexOf(letra) == -1) {
				setErros(getErros() + 1);
				chances--;
			}
			
			if (acertou == palavra.length()) { //Se o número de acertos é igual ao numero de letras, ganha o jogo
				break;
			}
			
			letrasUtilizadas += " " + getLetra() + " ";
			System.out.println("   ( São " + getPalavra().length() +" letras - Você tem: " + this.getChances() + " chances )");
			System.out.println("\nLetras Utilizadas: " + getLetrasUtilizadas());
			
		}	
			
	}
	
	private String geraPalavra() {
		Random gerador = new Random();
		palavra = palavras[gerador.nextInt(palavras.length)];
		return palavra;
	}

	private char recebeletra() {
		Scanner in = new Scanner(System.in);
		System.out.print("Informe uma letra: ");
		letra = in.next().toUpperCase().charAt(0); //UpperCase para colocar as letras em caixa alta, caso contrario, não identifica acerto se estiver em caixa baixa

		return letra;
	}
	
	
	//Get AND SET
	public String[] getPalavras() {
		return palavras;
	}
	
	public void addPalavras(String palavra) {
		this.palavras[index] = palavra;
		index++;
	}
	
	public String getPalavra() {
		return palavra;
	}
	
	public void setPalavra (String palavra) {
		this.palavra = palavra;
	}

	public char getLetra() {
		return letra;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}
	
	public int getChances() {
		return chances;
	}
	public void setChances(int chances) {
		this.chances = chances;
	}

	public String getLetrasUtilizadas() {
		return letrasUtilizadas;
	}

	public void setLetrasUtilizadas(String letrasUtilizadas) {
		this.letrasUtilizadas = letrasUtilizadas;
	}
	
	
}
