package aula7;
import java.util.Scanner;
// Pergunta 10 numeros e apresenta a soma deles no final
public class Exercicio4 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int i;
		double n = 0;
		
		for (i = 0; i < 10; i++) {
			
			System.out.println("Digite um numero pela " + (i+1)+ "° vez:");
			n = n + entrada.nextDouble();
			
			
		}
		entrada.close();
		System.out.printf("O total de tudo digitado foi: %.2f ", n);

	}

}
