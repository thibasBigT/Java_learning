package aula05;
import java.util.Scanner;
public class Exercicio6 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double peca1D = 10.99;
		double peca2D = 12.99;
		// calculo de uma lojinha de peças, peça1 vale X e peça 2 vale Y.
		System.out.println("Digite o numero de peças do tipo 1 que você deseja [Valor Uni = 10.99]");
		double pecas1D = Double.parseDouble(entrada.nextLine()); //aqui eu solicitei a entrada e string e já converti para double com o metodo.
		
		System.out.println("Digite o numero de peças do tipo 2 que você deseja [Valor Uni = 10.99]");
		double pecas2D = Double.parseDouble(entrada.nextLine());
		entrada.close();
		// Fiz o calculo multiplicando o numero de peças que o cliente quiz pelo valor.
		double calculoTotal = (pecas1D*peca1D) + (pecas2D*peca2D);
		
		System.out.printf("O total a pagar e: %.2f ", calculoTotal);
	}
}
