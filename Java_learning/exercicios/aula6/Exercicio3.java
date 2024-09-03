package aula6;
import java.util.Scanner;
// diz se um aluno reprovou ou foi aprovado
public class Exercicio3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite 4 notas de 1 a 10, (uma por vez)");
		double nota1 = Double.parseDouble(entrada.nextLine());
		double nota2 = Double.parseDouble(entrada.nextLine());
		double nota3 = Double.parseDouble(entrada.nextLine());
		double nota4 = Double.parseDouble(entrada.nextLine());
		
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if (media >= 7) { // Aprovado se a media for maior ou igual a 7
			System.out.println("Media: " +media+ ", Aluno aprovado");
			
		} else if (media > 5 && media < 7) { // recuperação se a media for entre 5 e 6.99
			System.out.println("Media: " +media+ ", Aluno em recuperacao");
		} else { //reprovado
			System.out.println("Media: " +media+ ", Aluno reprovado");
		}
		
		
		entrada.close();
		
	}

}
