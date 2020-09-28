package jogodaforca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		boolean continua = true;		
		
		Scanner entrada = new Scanner(System.in);
		Jogador jogador = new Jogador();

		System.out.println("\t\t****** JOGO DA FORCA ******\n\n");
		System.out.print("\nOlá, digite seu nome para começar: "); 
		jogador.setNome(entrada.nextLine());
		
		while(continua) {
			
			Jogo jogo = new Jogo();
			
			jogo.executar();
			
			System.out.println("\n\n*** VOCÊ GANHOU " + jogador.getNome() + "! ***"); 
			System.out.println("\nA palavra era: " + jogo.getPalavra());
			System.out.println("\nVocê errou " + jogo.getErros() +  " vezes"); //Falta Criar.
			System.out.println("\nQuer jogar novamente? S/N"); 
			if(entrada.nextLine().equals("n")) {
				continua=false; //decide se o laço vai ser quebrado ou não
			}
			
		}
		System.out.print("Obrigado por jogar!");
				
	}

}
