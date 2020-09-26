package jogodaforca;

import java.util.Random;
import java.util.Scanner;

public class Jogo {
	
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
	
	
	//EXECUÇÃO
	public void executar() {
       
		palavra = geraPalavra();
		acertos = new char [palavra.length()];
		
		for (int c= 0; c < palavra.length(); c++) {
			acertos[c] = '_';
			}
		
		
		while (acertou != palavra.length()) {
			recebeletra();

			for (index = 0; index < palavra.length(); index++) {
				if(palavra.charAt(index) == letra) {
					acertos[index] = letra;
					acertou++;
					
				}	
			
				System.out.print(acertos[index] + " ");				
				
			}	
			
			if (acertou == palavra.length()) { //Se o número de acertos é igual ao numero de letras, ganha o jogo
				break;
			}
	
			
			letrasUtilizadas += " " + letra + " ";
			System.out.println("   ( São " + palavra.length() +" letras - Você tem: " + jogador.getChances() + " chances )");
			System.out.println("\nLetras Utilizadas: " + letrasUtilizadas);
			
		}	
			
	}
	
	
	private String geraPalavra() {
		Random gerador = new Random();
		int index = gerador.nextInt(6);
		palavra = palavras[index];
		//palavra = palavras[gerador.nextInt(palavras.length)]; //Parece mais simples, não?
		return palavra;
	}

	public char recebeletra() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Informe uma letra: ");
		//letra = in.next().charAt(0);
		letra = in.next().toUpperCase().charAt(0); //UpperCase para colocar as letras em caixa alta, caso contrario, não identifica acerto se estiver em caixa baixa

		return letra;
	}
	
	
	//Get AND SET
	public String[] getPalavras() {
		return palavras;
	}
	
	public void setPalavras(String[] palavras) {
		this.palavras = palavras;
	}

	public void addPalavra(String palavra) {
		this.palavras[index] = palavra;
		index++;
	}

	public char getLetra() {
		return letra;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}


	public String getPalavra() {
		return palavra;
	}
	

	
	

}
