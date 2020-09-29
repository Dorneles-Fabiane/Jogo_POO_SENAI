package jogodaforca;

import java.util.Random;
import java.util.Scanner;

public class Jogo extends Jogador {

	//VARIAVEIS
	private String[] palavras = {"AMOR", "CACHORRO", "CINEMA", "CASA", 
			"ALGORITMO", "SABADO", "PIPA"};

	private int index;
	private char letra;
	private String letrasUtilizadas = "";
	private String palavra;
	private char[] acertos;
	private boolean ganhou;
	private String resposta = "";
	
	//EXECUÇÃO
	public void executar() {
       
		palavra = geraPalavra();
		acertos = new char [getPalavra().length()];
	
		for (int c= 0; c < getPalavra().length(); c++) {
			acertos[c] = '_';
			System.out.print(acertos[c] + " ");
			} System.out.println("\n\n");
		
		
		while (getChances() > 0) {
		recebeletra();

			for (index = 0; index < getPalavra().length(); index++) {
				if(palavra.charAt(index) == letra) {
					acertos[index] = letra;
					setAcertou(getAcertou() + 1);
				} 
			
				System.out.print(acertos[index] + " ");				
				
			}	if (palavra.indexOf(letra) == -1) {
				setErros(getErros() + 1);
				setChances(getChances() - 1);
			}
			
			if (getAcertou() == palavra.length()) { //Se o número de acertos é igual ao numero de letras, ganha o jogo
				setGanhou(true);
				System.out.println(retornaResposta(ganhou));
				break;
			} 
			
			letrasUtilizadas += " " + getLetra() + " ";
			System.out.println("   ( São " + getPalavra().length() +" letras - Você tem: " + this.getChances() + " chances )");
			System.out.println("\nLetras Utilizadas: " + getLetrasUtilizadas());
			
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

	private char recebeletra() {
		Scanner in = new Scanner(System.in);
		System.out.print("Informe uma letra: ");
		letra = in.next().toUpperCase().charAt(0); //UpperCase para colocar as letras em caixa alta, caso contrario, não identifica acerto se estiver em caixa baixa

		return letra;
	}
	
	private String retornaResposta(boolean ganhou) {
		if(ganhou) {
			resposta = "\n\n*** VOCÊ GANHOU " +  "! ***"; 
			resposta += "\nA palavra era: " + this.getPalavra();
			resposta += "\nVocê errou " + this.getErros() +  " vezes";
		} else {
			resposta = "\n\n*** VOCÊ PERDEU " +  "! ***"; 
			resposta += "\nA palavra era: " + this.getPalavra();
			resposta += "\nVocê errou " + this.getErros() +  " vezes";
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
