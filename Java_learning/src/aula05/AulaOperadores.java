package aula05;

public class AulaOperadores {
	public static void main(String[] args) {

		float num1 = 5f;
		float num2 = 2f;
		
		System.out.print(num1);
		System.out.print(num2);
		
		// soma:--------------------------------------------
		float soma = num1 = num2;
		System.out.println("soma e igual a: " + soma);
		
		// subtracao:---------------------------------------
		float subtracao = num1 - num2;
		System.out.println("A Sub e: " + subtracao);
		
		// multiplicacao:-----------------------------------
		float multiplicacao = num1 * num2;
		System.out.println("multiplicacao e igual a: " + multiplicacao);
		
		// divisao:-----------------------------------------
		float divisao = num1 / num2;
		System.out.println("A divisao e igual a: " + divisao);
		
		
		// modulo:------------------------------------------
		float modulo = num1 % num2;
		System.out.println("O modulo e igual a: " + modulo);
		
		// OPERADORES UNÁRIOS:------------------------------
		
		int numero = 15;
		System.out.println(" ");
		System.out.println(numero);

		numero++;
		System.out.println(numero);
		System.out.println(numero++); //Aqui ele vai somar 1
		System.out.println(numero);
		System.out.println(numero+1); //Aqui a mudança é so visual, ele não soma definitivo na variavel
		System.out.println(numero);
		
		numero--; //Vai tirar um do numero
		System.out.println(numero);
		
		// OPERADORES DE TRIBUIÇÃO
		
		int number = 5;
		System.out.println(" ");
		System.out.println("number");
		
		//number = number + 7
		number += 7;
		System.out.println("number");
		
		number /= 2; // Divide direto por 2
		System.out.println("number");
		
		
	}
}
