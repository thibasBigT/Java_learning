package aula06;
import java.util.Scanner;
public class SwitchCase {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o seu numero de usuario \n 0 - Admin \n 1 - User \n 2 - Ramdom");
		int escolha = Integer.parseInt(entrada.nextLine());
		entrada.close();
		switch (escolha){
			case 0:
				System.out.println("Bem vindo, Admin");
				break;
			case 1:
				System.out.println("Bem vindo, User");
				break;
			case 2:
				System.out.println("Bem vindo, Ramdom");
				break;
			
		}
		
		
		
		
	}

}
