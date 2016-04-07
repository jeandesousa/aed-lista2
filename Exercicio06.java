package br.edu.fameg.ads.aed.lista2;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		/*
		 * Faça um algoritmo que leia um nº inteiro e mostre uma mensagem
		 * indicando se este número é par ou ímpar. Ex: se (x%2=0) “x é par”, se
		 * (x%2=1) “x é impar”.
		 */

		int num1, num2 = 2;

		Scanner buffer = new Scanner(System.in);

		System.out.println("Escreva algum número: ");
		num1 = buffer.nextInt();

		if ((num1 % num2) == 0) {
			System.out.println("o número é par.");
		} else {
			System.out.println("o número é ímpar.");

		}
	}

}
