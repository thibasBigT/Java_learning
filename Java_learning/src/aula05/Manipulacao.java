package aula05;
import java.util.Scanner;
public class Manipulacao {
	public static void main(String[] args) {
		
		double salario = 1416.30;
		String salarioStr = Double.toString(salario);
		
		System.out.println(salario+salario);
		System.out.print(salarioStr+salarioStr);
		
		System.out.println( "");
		String idade = "25";
		int idadeInteiro = Integer.parseInt(idade);
		
		System.out.print(idadeInteiro);
		
		System.out.print(" ");

		//instanciar o Scanner
		 Scanner Scanner = new Scanner(System.in);
		 String preco = Scanner.nextLine();
		 
		 float precoFloat = Float.parseFloat(preco);
		 
		 Scanner.close();
	
	}
}
