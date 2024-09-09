package aula8;
import java.util.Calendar;
// comprimenta o usuario de acordo com o horario do dia

public class Exercicio1 {

	public static void main(String[] args) {
	Calendar c = Calendar.getInstance(); // Forçando uma instancia
		
		System.out.println("Hour: " + c.get(Calendar.HOUR_OF_DAY)); 
		
		if (c.get(Calendar.HOUR_OF_DAY) >= 6 && c.get(Calendar.HOUR_OF_DAY) < 12){ // bom dia :D
			
			System.out.println("Ola, boa bom dia!!"); 	
		} 
		else if (c.get(Calendar.HOUR_OF_DAY) < 18){ // Boa tarde ;D
			System.out.println("Ola, boa tarde!!");
		} 
		else if (c.get(Calendar.HOUR_OF_DAY) >= 18) { // Boa noite XD
			System.out.println("Ola, boa noite!!");
			
		} // Fim das condicionais

	}

}
