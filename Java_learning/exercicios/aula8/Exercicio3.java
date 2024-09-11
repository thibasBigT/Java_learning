package aula8;
import java.util.Scanner;
// Verifica uma String na entrada e retorna o numero de Caracteres Maiusculos, Minusculos, Numericos e Caracteres em Branco.
public class Exercicio3 {
	
	public static void main(String[] args) {
		int textoM = 0;
		int textom = 0;
		int textoN = 0;
		int textoB = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite alguma palavra: ");
		String texto = entrada.nextLine();
		
		
		
		for (int i = 0; i < texto.length(); i++) { // Iterador usado para referencia enquanto percorre a string
			
			if ((texto.charAt(i) >= 'A') && (texto.charAt(i) <= 'Z')) { // Percorre a String de A a Z, comparando uma a uma como Char.
				textoM++;
				
				}
			if ((texto.charAt(i) >= 'a') && (texto.charAt(i) <= 'z')) { // Percorre a String de A a Z, comparando uma a uma como Char.
				textom++;
				
			}
			
			if ((texto.charAt(i) >= '0') && (texto.charAt(i) <= '9')) { // Percorre para ver se tem uma String numerica
				textoN++;
				
			}
			
			if ((texto.charAt(i) == ' ')) { // Verifica os espaços em brancos
				textoB++;
				
			}
				
			
		
		}
		System.out.println("Numero de alfabeticos maiusculos; " + textoM + "\nNumero de alfabeticos minusculos: " + textom + "\nNumero de alfabeticos numericos: " + textoN + "\nNumero de caracteres em branco: " + textoB);
		
		
	}
	

}
