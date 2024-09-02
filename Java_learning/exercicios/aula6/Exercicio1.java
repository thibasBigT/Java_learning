package aula6;
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		//Contasta se um numero é par ou impar
		System.out.println("Digite um numero abaixo: ");
		Scanner entrada = new Scanner(System.in);
		
		double numero = (Double.parseDouble(entrada.nextLine())) % 2;
		
		if (numero == 0) { // Se modulo de numero por 2 for == zero significa que foi dividido por 2 sem restos
			System.out.println("Seu numero e par"); 
		} else {
			System.out.println("Seu numero e impar");
		}
		
		
		entrada.close();
		
	}

}
