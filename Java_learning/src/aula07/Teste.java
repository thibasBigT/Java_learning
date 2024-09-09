package aula07;
import java.util.Scanner;
public class Teste {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
				
		System.out.println("Quantas cambaolhotas você deseja fazer ?");
		int v = Integer.parseInt(entrada.nextLine());
		entrada.close();
		for (int cc = 1; cc <= v; cc++) {
			
			System.out.println("Cambalhota " + cc);
			
		}
	}

}
