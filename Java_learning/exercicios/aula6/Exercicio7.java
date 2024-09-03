package aula6;
// jogo de verdadeiro e falso

public class Exercicio7 {
	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		int c = 4;
		int d = 8;
		
		if (a <= b && b<d) {
			System.out.println("a <= b && b<d = True");
		} else {
			System.out.println("a <= b && b<d = False");
		}
		
		if (a == b || c != b) {
			System.out.println("a == b || c != b = True");
		} else {
			System.out.println("a == b || c != b = False");
		}
		
		if (d > a && c >= b) {
			System.out.println("d > a && c >= b  True");
		} else {
			System.out.println("d > a && c >= b  False");
		}
		
		if (a <= b || c <= d) {
			System.out.println("a <= b || c <= d  True");
		} else {
			System.out.println("a <= b || c <= d  False");
		}
		
		if ( b>c && c<a && d<=b) {
			System.out.println("b>c && c<a && d<=b  True");
		} else {
			System.out.println("b>c && c<a && d<=b  False");
		}
		
		
		
		
		
	}
}
