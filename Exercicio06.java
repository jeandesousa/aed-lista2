package br.edu.fameg.ads.aed.lista2;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		/*
		 * Fa�a um algoritmo que leia um n� inteiro e mostre uma mensagem
		 * indicando se este n�mero � par ou �mpar. Ex: se (x%2=0) �x � par�, se
		 * (x%2=1) �x � impar�.
		 */

		int num1, num2 = 2;

		Scanner buffer = new Scanner(System.in);

		System.out.println("Escreva algum n�mero: ");
		num1 = buffer.nextInt();

		if ((num1 % num2) == 0) {
			System.out.println("o n�mero � par.");
		} else {
			System.out.println("o n�mero � �mpar.");

		}
	}

}
