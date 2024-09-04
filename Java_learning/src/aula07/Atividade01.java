package aula07;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero, soma = 0;
		
		System.out.println("Digite um numero");
		numero = entrada.nextInt();
		soma += numero; // adiciona o numero que você colocar na frente
		
		System.out.println("Agora soma e: "+numero);
		soma++; // Adiciona 1 por vez
		
		System.out.println("Agora soma e " + soma);
	}

}
