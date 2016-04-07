package br.edu.fameg.ads.aed.lista2;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		double num1,num2,num3;
		
		Scanner buffer = new Scanner (System.in);
		
		num1 = 1.2375;
		
		System.out.println("Digite o seu salário: ");
		num2 = buffer.nextDouble();
		
		num3 = (num1*num2);
				
		System.out.println("O sálario com reajuste corresponde a: "+ num3);
		
	}

}
