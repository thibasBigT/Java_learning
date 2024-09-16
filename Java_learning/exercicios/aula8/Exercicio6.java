package aula8;
import java.util.Random;

// Gera 100 numeros aleatoriamente e verifica quais são pares, impares e primos.
public class Exercicio6 {

    public static void main(String[] args) {
    
        Random rand = new Random(); // Instanciei um objeto para o Random
        int nA, nP = 0, nI = 0, np = 0;
    
        for (int i = 0; i < 100; i++) { // Loop para repetir o codigo 100x
            
            nA = rand.nextInt(101); // Gera um número aleatório entre 1 e 100
            System.out.println("Numeros sorteados: " + nA);
            
            // Verifica se o número é par ou ímpar
            if (nA % 2 == 0) {
                nP++;
            } else {
                nI++;
            }
            
            // Verifica se o número é primo
            int c = 0; // Reinicia a contagem de divisores para cada número
            for (int n = 1; n <= nA; n++) { // Conta os divisores
                if (nA % n == 0) {
                    c++;
                }
            }
            
            if (c == 2) { // Um número é primo se tiver exatamente 2 divisores
                np++;
            }
        }
        // Resultado final
        System.out.println("\nEsse foi o resultado:\n\n" + 
                           "Numeros pares: " + nP + "\n" +
                           "Numeros impares: " + nI + "\n" +
                           "Numeros Primos: " + np);
    }
}

