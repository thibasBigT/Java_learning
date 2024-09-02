package aula6;
import java.util.Scanner;
public class Exercicio3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite 4 notas de 1 a 10, (uma por vez)");
		double nota1 = Double.parseDouble(entrada.nextLine());
		double nota2 = Double.parseDouble(entrada.nextLine());
		double nota3 = Double.parseDouble(entrada.nextLine());
		double nota4 = Double.parseDouble(entrada.nextLine());
		
		double media = nota1 + nota2 + nota3 + nota4 / 4;
		
		if (media >= 7) { // Aprovado
			System.out.println("Aluno aprovado");
			
		} else if (media = 7) {
			System.out.println("Aluno em recuperação");
		} else
		
	
	}

}
