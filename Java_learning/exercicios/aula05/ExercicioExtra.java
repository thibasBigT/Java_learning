package aula05;
import java.util.Scanner;
public class ExercicioExtra {
public static void main(String[] args) {
		
		System.out.println("Digite quantos dias voce viveu: ");
		Scanner entrada = new Scanner(System.in);
		
		int idade = entrada.nextInt();
		
		int diasB = idade%365; // modulo dos dias por anos, me dara o resto para futuros calculos
		
		int anos = idade/365; // me retorna quantos anos o caboblo viveu
		int diasF = diasB/30; // me indica quantos meses o caboclo viveu
		int dias = diasB%30; // me retorna quantos dias o caboclo viveu
		
		System.out.println("Voce ja viveu: " + anos + " Ano(s)");
		System.out.println("Voce ja viveu: " + diasF + " Mes(es)");
		System.out.println("Voce ja viveu: " + dias + " dia(s)");
		
		entrada.close();
		
			
	}

}
