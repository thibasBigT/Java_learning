package aula7;
import java.util.Scanner;
// recolhe um numero e faz a tabuada dele até o 25
public class Exercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n, i = 1; //numero N
		
		System.out.println("Digite um numero que farei uma tabuada dele:");
		n = Integer.parseInt(entrada.nextLine());
		entrada.close();
		for (i = 1; i < 26; i++) {
			
			System.out.println(n+" X " +i+ " = " + n*i);
			
		}

	}

}
