package jogodaforca;

import java.util.Random;
import java.util.Scanner;

public class Jogo {
	private String[] palavras = {"AMOR", "CACHORRO", "CINEMA", "CASA", 
			"ALGORITMO", "SABADO", "PIPA"};
	private char[] acertos;
	private int index;
	private char letra;
	private int acertou = 0;
	private int chances = 6;

	public void executar() {
		System.out.println("\t\t******JOGO DA FORCA******\n\n");
       
		String palavra = geraPalavra();
		
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
			
			if (acertou == palavra.length()) { //Se o n�mero de acertos � igual ao numero de letras, ganha o jogo.
				System.out.println("\n\n***Voc� Ganhou***");
				break;
			}
			
			System.out.println("   ( S�o " + palavra.length() +" letras - Voc� tem: " + chances + " chances )");
		}
	}
	
	private String geraPalavra() {
		Random gerador = new Random();
		//int index = gerador.nextInt(6);
		//String palavra = palavras[index];
		String palavra = palavras[gerador.nextInt(palavras.length)]; //Parece mais simples, n�o?
		return palavra;
	}

	public char recebeletra() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("\nInforme uma letra: ");
		//letra = in.next().charAt(0);
		letra = in.next().toUpperCase().charAt(0); //UpperCase para colocar as letras em caixa alta, caso contrario, n�o identifica acerto se estiver em caixa baixa.
		
		return letra;
	}
	
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

}
