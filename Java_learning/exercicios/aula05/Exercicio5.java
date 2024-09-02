package aula05;
import java.util.Scanner;
public class Exercicio5 {
	public static void main(String[] args) {
		// Instanciei um novo Scanner
		Scanner entrada = new Scanner(System.in);
		// solicitei as notas do aluno em variaveis chamadas nota1D e nota2D
		System.out.println("Digite sua primeira nota:");
		double nota1D = Double.parseDouble(entrada.nextLine());
		System.out.println(' ');
		System.out.println("Digite sua segunda nota:");
		double nota2D = Double.parseDouble(entrada.nextLine());
		entrada.close();
		// Fiz o calculo da media
		double media = (nota1D*0.40) + (nota2D*.60);
	
		System.out.print("Sua media final e: " + media);
		
		
	}
}
