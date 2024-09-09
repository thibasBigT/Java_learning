package aula7;
// Verifica dentro de um range quais são os numeros primos existemtes
public class Exercicio10 {

	public static void main(String[] args) {
		
		int i = 1,n = 1,c = 0; // i = range, n = range de testes, c = acumula quantos divisores i teve
		
		System.out.print("Esses numeros sao primos:");
		
		while (i < 2000){ // Este loop controla até qual range testara os numeros primos
			
			for (n = 1; n <= i; n++) { 
				
				if (i % n == 0) { // testa quais numeros dividem sem resto até o i
					c++;	
				}
				
			} // final loop for
		
			
			if (c == 2) { // se o ultimo teste resultou em apenas 2 numeros divisores ele é impresso como primo
				System.out.print(i + ", ");
			}
			i++;
			c = 0;
		} // Fim do loop while
				
	}

}
