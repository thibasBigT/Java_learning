package aula6;
import java.util.Scanner;
// contasta se um numero é maior ou menos do que o outro e imprimi o maior.
public class Exercicio2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		double numero1 = Double.parseDouble(entrada.nextLine());
		System.out.println("Digite outro numero numero");
		double numero2 = Double.parseDouble(entrada.nextLine());
		
		if (numero1 > numero2) {
			System.out.println("O numero 1 e maior!!!");
			
		}else if ( numero1 < numero2) { 
			
			System.out.println("O numero 2 e maior!!!");
		} else {
			
			System.out.println("Os numeros são iguais");
		}
		entrada.close();
		
	}

}
