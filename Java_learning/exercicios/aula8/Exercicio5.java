package aula8;
import java.util.Random;
// Gera 10 numeros aleatorios entre 5 e 50, exibi-os e depois os soma
public class Exercicio5 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int r = 0,n = 0, nN = 0; 
		
		for (int i = 1; i < 11; i++) { // Laco de repeticao que repete o codigo 10x
			
			nN = rand.nextInt(5, 50); // Cria um numero aleatorio entre 5 e 50
			n = n + nN;
			System.out.println("Numero " + i + ": " + nN);   // Exibi o numero aleatoio gerado
			
			
		}
		
		System.out.println("Somando tudo temos:" + n); // Mostra a soma de tudo
		

	}

}
