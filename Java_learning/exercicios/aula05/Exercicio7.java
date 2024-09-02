package aula05;
import java.util.Scanner;
public class Exercicio7 {
	public static void main(String[] args) {
	    // Instanciei um novo Scanner
		Scanner entrada = new Scanner(System.in);
		
		double valor1D = 10.00;
		
		System.out.println("Digite o valor da nota que voce ira pagar o produto:");
		double paga = Double.parseDouble(entrada.nextLine());
		entrada.close();
		double troco = paga-valor1D;
		
		System.out.printf("Obrigado pela compra, seu troco e um total de:  R$ %.2f ", troco);
		
	
		
		
	}

}
