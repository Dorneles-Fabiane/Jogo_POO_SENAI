package jogodaforca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		boolean continua = true;		
		
		Scanner entrada = new Scanner(System.in);
		Jogador jogador = new Jogador();
		Pessoa pessoa = new Pessoa();
		System.out.println("\t\t****** JOGO DA FORCA ******\n\n");
		System.out.print("\nOl�, digite seu nome para come�ar: "); 
		pessoa.setNome(entrada.nextLine());
		
		while(continua) {
			
			Jogo j = new Jogo();
			
			j.executar();
			
			System.out.println("\n\n*** VOC� GANHOU " + pessoa.getNome() + "! ***"); 
			System.out.println("\nA palavra era: " + j.getPalavra());
			System.out.println("\nVoc� errou " + jogador.getErros() +  " vezes"); //Falta Criar.
			System.out.println("\nQuer jogar novamente? S/N"); 
			if(entrada.nextLine().equals("n")) {
				continua=false; //decide se o la�o vai ser quebrado ou n�o
			}
			
			
		}
		System.out.print("Obrigado por jogar!");
				

	}

}
