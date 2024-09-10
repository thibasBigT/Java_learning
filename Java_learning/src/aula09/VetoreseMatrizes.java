package aula09;

public class VetoreseMatrizes {

	public static void main(String[] args) {
	
		String[] listaFrutas = new String[4];
		
		listaFrutas[0] = "Morango";
		listaFrutas[1] =  "Uva";
		listaFrutas[2] = "Pera";
		listaFrutas[3] = "Tomate";
		
		System.out.println();
		System.out.println("Fruta Pos 1: " + listaFrutas[1]);
		
		
		//Outro jeito de declarar LISTAS!!!
		String[] listaFrutas2 = {"Melancia", "Abacaxi", "Pitaia", "Banana" };
		
		
		
		
		
		int qtdFrutas = listaFrutas2.length;
		System.out.println("Qtd de fruas:" + qtdFrutas);
		
		for (int i = 0; i < qtdFrutas ; i++) {
			System.out.print(listaFrutas2[i] + ", ");
		
		}
		
		// Criar uma lista de numeros
		
		int[] numeros = {16, 24, 29, 33};
		
		// For EACH --> Percorre a lista e acessa os valores das opições
		
		
		
		for (int numero: numeros) {
			System.out.println(numero);
			
		}
		
		// tabuleiro do jogo da velha
		
		char[][] tabuleiro = new char[3][3];
		
		tabuleiro[0][0] = 'x';
		tabuleiro[1][1] = 'O';
		tabuleiro[2][2] = 'X';
		

	}

}
