package aula05;
import java.util.Scanner;
public class Exercicio8 {
	public static void main(String[] args) {
		  Scanner entrada = new Scanner(System.in);
		  	System.out.println("Digite o quanto voce quer converter em reais");
	        double reais = Double.parseDouble(entrada.nextLine());
	        
	        double taxaUSD = 5.61;
	        double taxaEUR = 6.24;
	        double taxaARS = 168.82;
	        double taxaGBP = 7.37;

	        System.out.printf("Seus reais valem: US$ %.2f%n", reais / taxaUSD);
	        System.out.printf("Seus reais valem: EUR€ %.2f%n", reais / taxaEUR);
	        System.out.printf("Seus reais valem: ARS$ %.2f%n", reais * taxaARS);
	        System.out.printf("Seus reais valem: GBP£ %.2f%n", reais / taxaGBP);
	        
	        entrada.close();;
		
	}

}
