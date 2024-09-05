package aula6;
import java.util.Scanner;
// calcula impostos e precos relacionados a cargas de caminhoes
public class Exercicio11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int origem, codigo, tributo = 0;
		double peso, preco = 0 , imposto = 0;
		
		System.out.println("Digite a origem da sua carga (1 a 5): ");
		origem = Integer.parseInt(entrada.nextLine()); // captura da origem 1 a 5
		
		System.out.println("Digite o peso da sua carga em toneladas:");
		peso = Double.parseDouble(entrada.nextLine())*1000; // peso em toneladas convertido para  KG
		
		System.out.println("Digite o codigo da carga (10 a 40): ");
		codigo = Integer.parseInt(entrada.nextLine()); // captura o codigo da carga
		entrada.close();
		if (codigo >= 10 && codigo <= 20) {
			preco = peso*100; 
			
		} else if (codigo >= 21 && codigo <= 30) {
			preco = peso*250;
			
		} else if (codigo >= 31 && codigo <= 40) {
			preco = peso*3;
			
		}
		
		switch (origem) {
			case 1:
				imposto = preco*1.35;
				tributo = 35;
				break;
			case 2:
				imposto = preco*1.25;
				tributo = 25;
				break;
			case 3:
				imposto = preco*1.15;
				tributo = 15;
				break;
			case 4:
				imposto = preco*1.05;
				tributo = 5;
				break;
			case 5:
				imposto = 0;
				tributo = 0;
				break;
				
				
		

		}
		
		System.out.printf("O peso total da sua carga foi: %.2f KG\n o preco da carga foi um total de:RS$ %.2f \n o total de imposto cobrado foi de:RS$ %.2f \n foi cobrado uma tarifa de %d%%  ", peso, preco, imposto, tributo);
		
	}

}
