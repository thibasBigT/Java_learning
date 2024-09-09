package aula7;
import java.util.Scanner;
// Mostra os numeros X, que, sao divisores de um numero Y, com resto = 0
public class Exercicio9 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int i, n; // variaveis usadas
		
		do { // captura o numero do usuario em n
			System.out.println("Digite um numero positivo:");
			n = Integer.parseInt(entrada.nextLine());
		} while (n < 1); // Fim do Loop Do
		entrada.close();
		
		
		System.out.print("numeros divisore de " + n+ ": ");
		for ( i = 1; i < n+1; i++) { // ve os numeros divisores de n
			
			if (n % i == 0) {
				System.out.print(i+", ");
			} 
				
		} // Fim do Loop For
		
		
	}

}
