package aula6;
import java.util.Scanner;
// faz calculo basico
public class Exercicio5 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		double numero1 = Double.parseDouble(entrada.nextLine());
		
		System.out.println("Digite qual operação você quer realizar: \n Digite + para somar \n Digite - para subtrair \n Digite * para multiplicar \n Digite / para dividir");
		String operacao = entrada.nextLine();
	
		System.out.println("Digite qual o numero que você deseja continuar a operacao");
		double numero2 = Double.parseDouble(entrada.nextLine());
		
		entrada.close();
		double resultado;
		
		  if (operacao.equals("+")) {
	            resultado = numero1 + numero2;
	            System.out.println(numero1 + " " + operacao + " " + numero2 + " = " + resultado);
	      } else if (operacao.equals("-")) {            
	            resultado = numero1 - numero2;
	            System.out.println(numero1 + " " + operacao + " " + numero2 + " = " + resultado);
	      } else if (operacao.equals("*")) {
	            resultado = numero1 * numero2;
	            System.out.println(numero1 + " " + operacao + " " + numero2 + " = " + resultado);
	      } else if (operacao.equals("/")) { 
	            resultado = numero1 / numero2;
	            System.out.println(numero1 + " " + operacao + " " + numero2 + " = " + resultado);
	      } else {
	            System.out.println("Não deu certo :(");
	      }
		
		
		
	}

}
