package br.edu.fameg.ads.aed.lista2;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		double num1,num2,num3,num4;
		
		Scanner buffer = new Scanner (System.in);
		
		System.out.println("Digite o grau em Celsius: ");
		num1 = buffer.nextDouble();
		
		num2 = 1.8;
		num3 = 32;
		num4 = (num1*num2)+num3;
				
		System.out.println(+num1+ " ºC corresponde em ºF à "+ num4);
		
	}

}
