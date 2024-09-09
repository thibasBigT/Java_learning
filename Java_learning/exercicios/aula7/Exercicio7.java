package aula7;
import java.util.Scanner;
// retorna quantos alunos se destacaram nota em relação a media da sala.
public class Exercicio7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int i;
		double M,a,aA = 0; // M = media da sala, a = nota dos alunos em geral, aA = alunos acima da media.
		System.out.println("Digite a media da sala:");
		
		M = Double.parseDouble(entrada.nextLine()); // Recebe a media da sala
		for (i = 1; i<20; i++) { // enquanto i for menor que o numero de alunos
			
			System.out.println("Digie  nota do aluno " + i);
			a = Double.parseDouble(entrada.nextLine());
			
			if (a > M) {
				aA++;
				
			}
		} // fim do loop
		
		entrada.close();
		System.out.printf("%.0f Alunos tiraram notas acima da media.", aA);
	}

}
