package jogodaforca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner entradaNome = new Scanner(System.in);
		Jogador jogador = new Jogador();
		System.out.println("\t\t****** JOGO DA FORCA ******\n\n");
		System.out.print("\nOl�, digite seu nome para come�ar: "); 
		jogador.setNome(entradaNome.nextLine());
		
		Jogo j = new Jogo();
		
		j.executar();
		
		System.out.println("\n\n*** VOC� GANHOU " + jogador.getNome() + "! ***");
		System.out.println("\nA palavra era: " + j.getPalavra());
		System.out.println("\nVoc� errou " + j.getErros() +  " vezes"); //Falta Criar
		System.out.println("\nQuer jogar novamente? S/N"); // Falta Criar.

		
			

	}

}
