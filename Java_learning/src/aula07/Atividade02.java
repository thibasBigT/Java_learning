package aula07;

import java.util.Scanner;

public class Atividade02 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int xis = 1;
		System.out.println("Digite um numero");
		int n = entrada.nextInt();
		
		
		while (xis != 11) {
			System.out.println(n + " X  "+xis+" = " + (n*xis));
			xis ++;
			
		}
		
		
		
	}

}
