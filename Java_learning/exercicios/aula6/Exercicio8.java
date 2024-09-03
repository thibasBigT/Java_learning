package aula6;
import java.util.Scanner;
// calcula o consumo km/L de um carro e fala a verdade na cara
public class Exercicio8 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite quantos KM seu carro percorreu:");
		int km = Integer.parseInt(entrada.nextLine());
		entrada.close();
		System.out.println("Digite quntos Litros seu carro utilizou:");
		int lt = Integer.parseInt(entrada.nextLine());
		
		int eficiencia = km/lt;
		
		if (eficiencia < 8) {
			System.out.println("Seu carro bebe eim!!!");
		}else {
			System.out.println("Seu carro tem uma otima eficiencia!!!");
		}
	}

}
