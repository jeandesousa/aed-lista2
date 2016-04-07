package br.edu.fameg.ads.aed.lista2;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		/*
		 * Fazer um programa que calcule a tabuada de qualquer número, e o
		 * limite de cálculo deve ser definido pelo usuário:
		 */

		Scanner ler = new Scanner(System.in);
		int num, limite;
		System.out.println("Digite um número a ser multiplicado");
		num = ler.nextInt();
		
		System.out.println("Digite um número limite");
		limite = ler.nextInt();
		
		for (int i = 1; i <= limite; i++) {

			System.out.println(num + " x " + i + " = " + num * i);

		}
	}

}