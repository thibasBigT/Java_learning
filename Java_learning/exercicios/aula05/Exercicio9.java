package aula05;
import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		
		
	 	Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro entre 1 e 999");
        String numero = scanner.nextLine();
        int numeroInt = Integer.parseInt(numero);
        
        int centena = (int) (numeroInt / 100f);
        int centena1 = (int) (centena * 100f);
        int dezena = (int) (numeroInt % centena1);
        int dezena1 = (int) (dezena / 10f);
        int dezena10 = (int) (dezena1 * 10f);
        int unidade = (int) (dezena % dezena10);
        
        System.out.println("Centena: " + centena1 + "\nDezena: " + dezena10 + "\nUnidade: " + unidade);
        
        scanner.close();
}
}
