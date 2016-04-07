package br.edu.fameg.ads.aed.lista2;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		double num1,num2,num3,num4;
		
		Scanner buffer = new Scanner (System.in);
		
		System.out.println("Digite o grau em Fahrenheit: ");
		num1 = buffer.nextDouble();
		
		num2 = 32;
		num3 = 1.8;
		num4 = (num1-num2)/num3;
				
		System.out.println(+num1+ " ºF corresponde em ºC é "+ num4);
		
	}

}
