package aula6;
import java.util.Scanner;
// fala se dois numeros são multiplos entre sí
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite dois numeros, um por vez:");
        double numero1 = Double.parseDouble(entrada.nextLine());
        double numero2 = Double.parseDouble(entrada.nextLine());
        entrada.close();
        
        if (numero1 % numero2 == 0 && numero2 % numero1 == 0) {
            System.out.printf("%.0f e %.0f sao multiplos entre si", numero1, numero2);
        }
        
        else {
            System.out.printf("%.0f e %.0f nao sao multiplos entre si.", numero1, numero2);
        }
    }
}
