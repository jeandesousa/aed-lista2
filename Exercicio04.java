package br.edu.fameg.ads.aed.lista2;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		/*
		 * Faça um algoritmo em Java para calcular e exibir do salário líquido
		 * de um professor, onde o número de horas, o valor da hora e o
		 * percentual do INSS devem ser fornecidos pelo usuário: salario_bruto
		 * <- num_hora_aula * valor_hora_aula salario_liquido <- salario_bruto –
		 * (salario_bruto * percentual_INSS).
		 */

		double num1, num2, num3, num4, num5, num6, num7;
		
		Scanner buffer = new Scanner (System.in);
		
		num1 = 1000;

		System.out.println("Digite o número de horas: ");
		num2 = buffer.nextDouble();
		
		System.out.println("Digite o valor da hora: ");
		num3 = buffer.nextDouble();

		System.out.println("Digite o percentual do INSS: ");
		num4 = buffer.nextDouble();
		
		num5 = (num4/num1);
		num6 = (num2*num3);
		
		System.out.println("O salário bruto corresponde a "+ num6);
		num7 = num6-(num6*num5);

		System.out.println("O salário liquido corresponde a "+ num7);
	}

}
