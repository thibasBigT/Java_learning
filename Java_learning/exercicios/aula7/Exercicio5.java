package aula7;
import java.util.Scanner;
// Recolhe 12 valores do usuario e exibi o maior no final do codigo.
public class Exercicio5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// ----------------------Variaveis utilizadas----------------------
		int i; // interador
		double n = 0; // maior valor
		// ----------------------------------------------------------------
		
		
		for (i = 0; i < 12; i++) {
		
			System.out.println("Digite um numero: ");
				double numero = Double.parseDouble(entrada.nextLine());
				
				if (numero > n) { // se numero for maior que o ultimo valor n será esse valor agora.
					n = numero;
				}		
		}
		entrada.close();
		System.out.printf("O maior valor digitado foi: %.2f", n); // exibi o maior valor
		
				
	}

}
