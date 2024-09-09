package aula7;
import java.util.Scanner;
// soma todos os numeros até chegar um um numero teto declarado pelo usuario
public class Exercicio8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n,i,nN; //N armazena o numero teto do usuario, i é meu iterador e o numero que soma dentro de nN até ser chegar no numero do usuario teto.
		
		do {
			System.out.println("Digite um numero n para mim lhe mostrar a soma do intervalo entre ele e 1");
			n = Integer.parseInt(entrada.nextLine());
			
			
		} while (n <= 1); // Fim do loop Do
		entrada.close();
		nN = n;
		
		for (i = 1; i<n; i++) {
			 nN = nN + i;
			
		} //fim do loop for
		
		System.out.println("A soma de todos os numeros até " + n+ " e, " + nN);
	}

}
