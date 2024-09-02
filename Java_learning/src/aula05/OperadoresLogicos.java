package aula05;

public class OperadoresLogicos {
public static void main(String[] args) {
		
		// LOGICA AND (&&)
	    // EMAIL     SENHA     LOGIN
		// TRUE      TRUE      TRUE
		// TRUE      FALSE     FALSE
		// FALSE     TRUE      FALSE
		// FALSE     FALSE     FALSE
		
		boolean verificaEmail = true;
		boolean verificaSenha = true;
		
		boolean logicaE = verificaEmail && verificaSenha; // AND
		System.out.println(logicaE);
		
		// Logica OR (||)
		// SOL DO DOM	JOGO BR     CHURRASCO NO DOM.
		// TRUE			FALSE		TRUE
		// TRUE			TRUE		TRUE
		// FALSE		FALSE		TRUE
		// FALSE 		FALSE		FALSE
		
		boolean logicaOU = false || false;
		System.out.println(logicaOU);
		
		// LOGICA NOT (!)
		
		boolean negacao = !false;
		System.out.println(negacao);
		
	}
}
