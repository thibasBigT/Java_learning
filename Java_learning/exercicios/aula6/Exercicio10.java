package aula6;
import java.util.Scanner;
// faz o calculo do salario de um funcionario conforme sua faixa salarial
public class Exercicio10 {
	public static void main(String[] args) {
		double salario2 = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu salario: ");// Capturei o salario do funcionario para os calculos
		double salario = Double.parseDouble(entrada.nextLine());
		
		if (salario < 280.00) {
			salario2 = salario*1.20;
			System.out.println(
					  "Salario antes do reajuste: R$" + salario 
					+ "\nPercentual aumentado: 20%"
					+ "\nValor do aumento: R$" + salario * 0.20
					+ "\nNovo salario com reajuste: R$" + salario2);
			
		} else if (salario > 280.00 && salario < 700) {
			salario2 = salario*1.15;
			System.out.println(
					  "\nSalario antes do reajuste: R$" + salario 
					+ "\nPercentual aumentado: 15%"
					+ "\nValor do aumento: R$" + salario * 0.15
					+ "\nNovo salario com reajuste: R$" + salario2);
		
		} else if (salario > 700.00 && salario < 1500.00) {
			salario2 = salario*1.10;
			System.out.println(
					  "\nSalario antes do reajuste: R$" + salario 
					+ "\nPercentual aumentado: 10%"
					+ "\nValor do aumento: R$" + salario * 0.10
					+ "\nNovo salario com reajuste: R$" + salario2);
			
			
		} else if (salario > 1500.00) {
			salario2 = salario*1.05;
			System.out.println(
					  "\nSalario antes do reajuste: R$" + salario 
					+ "\nPercentual aumentado: 5%"
					+ "\nValor do aumento: R$" + salario * 0.05
					+ "\nNovo salario com reajuste: R$" + salario2);
			
			
		} else {
			System.out.println("Voce nao se enquadra no perfil da empresa.");
		}

	}

}
