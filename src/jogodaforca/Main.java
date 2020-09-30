package jogodaforca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		boolean continua = true;		
		
		Scanner entrada = new Scanner(System.in);
		
		Jogador jogador = new Jogador();

		System.out.println("\t\t****** JOGO DA FORCA ******\n\n");
		System.out.print("\nOl�, digite seu nome para come�ar: "); 
		jogador.setNome(entrada.nextLine());
		System.out.println("Jogador: " + jogador.getNome());
		System.out.println("\n");
		
		while(continua) {
			
			Jogo jogo = new Jogo();
			jogo.executar();
			
			System.out.println("\nQuer jogar novamente? S/N"); 
			if(entrada.nextLine().toUpperCase().equals("N")) {
				continua = false; //decide se o la�o vai ser quebrado ou n�o
			}
			
		}
		System.out.print("Obrigado por jogar!");
				
	}

}
