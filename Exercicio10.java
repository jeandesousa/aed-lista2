package br.edu.fameg.ads.aed.lista2;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		/*
		 * Fa�a uma Programa que receba a idade e a altura de v�rias pessoas.
		 * Calcule e imprima a m�dia das alturas das pessoas com mais de 50
		 * anos. Para encerrar a entrada de dados, digite idade <= zero.
		 */
		Scanner buffer = new Scanner(System.in);

		int idade = 0, i, qtdpessoas;
		double altura = 0, media = 0;

		System.out.println("Digite a quantidade de pessoas que deseja calcular: ");
		qtdpessoas = buffer.nextInt();

		for (i = 0; i <= qtdpessoas; i++) {

			System.out.println("Digite a sua idade: ");
			idade = buffer.nextInt();
			System.out.println("Digite a sua altura: ");
			altura = buffer.nextDouble();

		}
		media = (altura / qtdpessoas);
		for (i = 0; i <= qtdpessoas; i++) {
			if (idade >= 50) {

				System.out.println("A media das alturas das pessoas com mais de 50 anos �: " + media);
			}

		}
	}

}
