package jogodaforca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		boolean continua = true;		
		
		Scanner entrada = new Scanner(System.in);
		Jogador jogador = new Jogador();
		Pessoa pessoa = new Pessoa();
		System.out.println("\t\t****** JOGO DA FORCA ******\n\n");
		System.out.print("\nOlá, digite seu nome para começar: "); 
		pessoa.setNome(entrada.nextLine());
		
		while(continua) {
			
			Jogo j = new Jogo();
			
			j.executar();
			
			System.out.println("\n\n*** VOCÊ GANHOU " + pessoa.getNome() + "! ***"); 
			System.out.println("\nA palavra era: " + j.getPalavra());
			System.out.println("\nVocê errou " + jogador.getErros() +  " vezes"); //Falta Criar.
			System.out.println("\nQuer jogar novamente? S/N"); 
			if(entrada.nextLine().equals("n")) {
				continua=false; //decide se o laço vai ser quebrado ou não
			}
			
			
		}
		System.out.print("Obrigado por jogar!");
				

	}

}
