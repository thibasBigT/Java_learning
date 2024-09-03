package aula6;
import java.util.Scanner;
// calcula a conta do consumo da conta de energia de 3 tipos de ropriedades diferentes.
public class Exercicio9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite em qual tipo sua propriedade se encaixa: \n 1 para residencia \n 2 para comercio \n 3 para industria");
		int escolha = Integer.parseInt(entrada.nextLine());
		System.out.println("Digite o consumo de KW da sua propriedade: ");
		int consumo = Integer.parseInt(entrada.nextLine());
		entrada.close();
		switch (escolha) {
			case 1:
				System.out.println("Sua conta deu: R$"+consumo*0.60);
				break;
			case 2:
				System.out.println("Sua conta deu: R$"+consumo*0.48);
				break;
			case 3:
				System.out.println("Sua conta deu: R$"+consumo*1.29);
				break;
			default:
				System.out.println("Voce nao digitou uma opcao valida!!");
				

		}

	}

}
