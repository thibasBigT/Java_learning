package aula7;
import java.util.Scanner;
// Pergunta se o user deseja continuar no Loop
public class Exercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int decisao;
		
		
		do {
			System.out.println("Hello, World!!");
			
			System.out.println("Voce deseja continuar  o loop ? Digite (1) para Sim / (2) para Nao:");
			decisao = Integer.parseInt(entrada.nextLine());
			
		} while (decisao == 1);
		entrada.close();
		System.out.print("aCabou-se");
	}

}
