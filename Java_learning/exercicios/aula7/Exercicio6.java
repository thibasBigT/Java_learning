package aula7;
import java.util.Scanner;
// Mostra todos os numeros pares no intervalo de 0 a um numero digitado pelo usr.
public class Exercicio6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int i, n; // Variaveis utilizadas
		
		System.out.println("Digite um numero que direi quais pares existem entre ele e 2:");
		n = Integer.parseInt(entrada.nextLine());
		System.out.println("Entre 2 e " + n + " Existem:");
		entrada.close();
		for (i = 0; i < n; i+=2) {
			System.out.println(i);
			
		}
		
	}

}
