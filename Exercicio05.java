package br.edu.fameg.ads.aed.lista2;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		/*
		 * Ler 3 valores e escreve-los em ordem crescente
		 */

		int num1, num2, num3;

		Scanner buffer = new Scanner(System.in);

		System.out.println("Digite o primeiro numero: ");
		num1 = buffer.nextInt();

		System.out.println("Digite o segundo numero: ");
		num2 = buffer.nextInt();
		
		System.out.println("Digite o terceiro numero: ");
		num3 = buffer.nextInt();
		
		if ((num1 > num2) && (num2 >= num3)) {
		System.out.println (""+num3 +num2 +num1);
		}
		else if
		((num2>=num1) && (num2>num3) && (num1>=num3)){
		System.out.println (""+num3+num1+num2);
		}
		else if
		((num2>num1) && (num2>=num3) && (num1<=num3)){
		System.out.println(""+num1+num3+num2);
		}
		else if
		((num2>num1) && (num2<=num3)){
		System.out.println(""+num1+num2+num3);
		}
		else if
		((num2<num1) && (num1<num3)){
		System.out.println(""+num2+num1+num3);
		}
		else if
		((num2<num3) && (num3<=num1)){
		System.out.println (""+num2+num3+num1);
		}
		else{
		System.out.println(""+num1+num2+num3);
		}
	}

}
