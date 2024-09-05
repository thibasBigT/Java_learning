package aula6;
import java.util.Scanner;
// coleta 3 dados do usuario e retorna qual o tipo de triangulo pode ser formado.
public class Exercicio12 {
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	double a,b,c,bolso; // variaveis usadas
	
	System.out.println("Digite 3 numeros para ver se forma um triangulo (1 valor por vez):");
	 a = Double.parseDouble(entrada.nextLine()); // lado A = 3
	
	 b = Double.parseDouble(entrada.nextLine()); // lado B = 6
	
	 c = Double.parseDouble(entrada.nextLine()); // lado C = 6
	 entrada.close();
	 // Desvio para por em ordem decrescente.
	 
	 if (a < b) {
         bolso = a;
         a = b;
         b = bolso;
	 }	
	 if (a < c) {
		 bolso = a;
		 a = c;
		 c = bolso; // concertando a ordem
	 }
	 
	System.out.println("Seu triangulo forma ou e:");
	if ( a >= b + c) {
		System.out.println("NAO FORMA TRIANGULO");
	} else if (a*a == b*b + c*c) { // 9,16, 25
		System.out.println("TRIANGULO RETANGULO");
	} else if (a*a < b*b + c*c) {
		System.out.println("TRIANGULO ACUTANGULO;");
	} 
	
	if (a == b && b == c) {
		System.out.println("TRIANGULO EQUILATERO");
	} else if (a == b || a == c) {
		System.out.println("TRIANGULO ISOSCELES;");
	} else {
		System.out.println("Nenhum dos casos");
	}
	
	}
	
}
