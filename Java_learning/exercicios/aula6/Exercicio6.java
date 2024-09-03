package aula6;
import java.util.Scanner;
// calcula a idade de uma pessoa e verifica a situação de obrigatoriedade no voto eleitoral.
public class Exercicio6 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o ano em que você nasceu:");
		int idade = 2024 - Integer.parseInt(entrada.nextLine()); //calculo a idade para o desvio condicional
		entrada.close();
		
		if (idade >= 18) {
			System.out.println("Atencao!!!! voce e obrigado a votar");
		} else if (idade >= 16 && idade < 18) {
			System.out.println("Atencao!!!! voce e obrigado a votar");
		} else if (idade < 18) {
			System.out.println("Atencao!!!! voce e obrigado a votar");
		}
		
	}

}
