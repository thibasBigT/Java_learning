package aula9;

public class Exercicio1 {

	public static void main(String[] args) {
		//Considerando o trecho de código Java representado a seguir:
		
		int[] v = {2, 0, 3, 9};
		
		v[v[2]] = v[v[1]];
		
		for (int i: v){
		System.out.print(i);
		}
		
		//O que será impresso na tela?
		// a) 2 0 3 2
		// b) 2 0 3 9
		// c) 2 0 0 9
		// d) 2 3 3 2
		
		// Resposta 2032, a reatribuição do indice fica v[3] = v[0], logo, o 9 será substituido por 2, numero no indice 0 de V.


	}

}
