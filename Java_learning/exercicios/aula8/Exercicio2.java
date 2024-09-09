package aula8;
import java.util.Calendar;
// Checa o dia da semana pelo calendar DAY_OF_WEEK, e se for terça... TEM FEIRA !!!!!
public class Exercicio2 {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		int day = c.get(Calendar.DAY_OF_WEEK);
		
		if (day != 3) {
			System.out.println("tudo igual");
		} 
		else {
			System.out.println("Hoje tem feira !!!!!!!!");
		} // Fim das condicionais
		

	}

}
