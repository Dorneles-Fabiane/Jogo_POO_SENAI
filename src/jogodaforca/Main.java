package jogodaforca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner entradaNome = new Scanner(System.in);
		Jogador jogador = new Jogador();
		System.out.println("\t\t****** JOGO DA FORCA ******\n\n");
		System.out.print("\nDigite seu nome para come�ar: "); //Apenas recebe o nome
		jogador.setNome(entradaNome.nextLine());
		
		Jogo j = new Jogo();
		
		j.executar();
		
			

	}

}
