package jogodaforca;

import java.util.Random;
import java.util.Scanner;

public class Jogo extends Jogador {

	//VARIAVEIS
	private String[] palavras = {"AMOR", "CACHORRO", "CINEMA", "CASA", 
			"ALGORITMO", "SABADO", "PIPA"};
	private char[] acertos;
	private char letra;
	private int index;
	private String letrasUtilizadas = "";
	private String resposta = "";
	private String palavra;
	private boolean ganhou;
	
	
	//EXECU��O
	public void executar() {
       
		palavra = geraPalavra();
		acertos = new char [getPalavra().length()];
		
		//Popula o array 'acertos' e faz a primeira impress�o do n�mero de letras na tela.
		for (int c= 0; c < getPalavra().length(); c++) {
			acertos[c] = '_';
			System.out.print(acertos[c] + " ");
			}
		
			System.out.println("\n\n");
			
			nChancesnLetras();
		
		while (getChances() > 0) { //Verifica se o jogador ainda possui chances.
			recebeLetra();
			
			//Verifica se a letra existe no respectivo indice, caso exista faz a troca do ' _ ' pela letra informada.
			for (index = 0; index < getPalavra().length(); index++) { 
				if(palavra.charAt(index) == letra) {
					acertos[index] = letra;
					setAcertou(getAcertou() + 1);
				} 
			
				System.out.print(acertos[index] + " ");	
			} 
			
			System.out.print("\n\n");	
			
			if (palavra.indexOf(letra) == -1) { //Verifica se a letra existe na String, caso n�o exista, retorna '-1'.
				setErros(getErros() + 1);
				setChances(getChances() - 1);
				Boneco();
			} nChancesnLetras();
			
			if (getAcertou() == palavra.length()) { //Se o n�mero de acertos � igual ao numero de letras, ganha o jogo
				setGanhou(true);
				System.out.println(retornaResposta(ganhou));
				break;
			} 
			
			letrasUtilizadas += " " + getLetra() + " ";
			System.out.println("Letras Utilizadas: " + getLetrasUtilizadas());
			
		} 
		
		if (getChances() == 0) {
			System.out.println(retornaResposta(ganhou = false));
		}	
			
	}

	private String geraPalavra() {
		Random gerador = new Random();
		palavra = palavras[gerador.nextInt(palavras.length)];
		return palavra;
	}

	private char recebeLetra() {
		Scanner in = new Scanner(System.in);
		System.out.print("Informe uma letra: ");
		letra = in.next().toUpperCase().charAt(0); //UpperCase para colocar as letras em caixa alta, caso contrario, n�o identifica acerto se estiver em caixa baixa
		System.out.println("\n");
		return letra;
		
	}
	
	private void nChancesnLetras() {
		System.out.println("   ( S�o " + getPalavra().length() +" letras - Voc� tem: " + this.getChances() + " chances )\n");
	}
	
	private String retornaResposta(boolean ganhou) {
		if(ganhou) {
			resposta = "\n\n*** VOC� GANHOU " +  "! ***"; 
			resposta += "\nA palavra era: " + this.getPalavra();
			resposta += "\nVoc� errou " + this.getErros() +  " vezes";
		} else {
			resposta = "\n\n*** VOC� PERDEU " +  "! ***"; 
			resposta += "\nA palavra era: " + this.getPalavra();
			resposta += "\nVoc� errou " + this.getErros() +  " vezes";
		} return resposta.toString();
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

	public String getLetrasUtilizadas() {
		return letrasUtilizadas;
	}

	public void setLetrasUtilizadas(String letrasUtilizadas) {
		this.letrasUtilizadas = letrasUtilizadas;
	}

	public boolean isGanhou() {
		return ganhou;
	}

	public void setGanhou(boolean ganhou) {
		this.ganhou = ganhou;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}
		
}