package aula9;

public class Exercicio2 {
	public static void main(String[] args) {
		
		 String s = "FIAPTOKIO";
		 char[] r = new char[9];
		 for (int i = s.length() - 1; i >= 0; i--) {
	     r[i] = s.charAt(i);
		 }
		 for (char letra: r) {
		     System.out.print(letra);
		 }
		 /*
		   	a) OIKOTPAIF
			b) FIAPTOKIO
			c) 1110162068068
			d) 150,251,02
		   
		  */
		 
		 
		//Reposta B, as letras da STR são armazenadas no mesmo numero do indice da lista, logo, a saida será a mesma coisa. 
		 
		 
		 
	}
	
}
