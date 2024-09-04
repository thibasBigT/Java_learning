package aula07;

public class WhileRepeticao {

	public static void main(String[] args) {
		int i = 0;
		
		while ( i < 0) {
			
			i++;
			
			if ( i ==3) {	
				continue; // faz ignorar o restante do bloco do codigo e voltar para codição while
			}
		
			System.out.println("produto " + i);
		}
		
		while ( i < 0) {
			
			i++;
			
			if ( i == 7) {	
				break; // faz quebrar o laço e ir para fora do while
			}
		
			System.out.println("produto " + i);
		}


	}

}
