package br.edu.fameg.ads.aed.lista2;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {

		/*
		* Escreva um Programa que receba a idade de 15 pessoas, calcule e imprima: 
		- a quantidade de pessoas em cada faixa etária; a porcentagem de cada faixa etária em relação ao total de pessoas. 
		As faixas etárias são:
		1 a 15 anos 
		16 a 30 anos 
		31 a 45 anos 
		46 a 60 anos 
		> = 61 anos
		*/

		Scanner buffer = new Scanner(System.in);
		
		int i, idade, faixa1=0,faixa2=0,faixa3=0,faixa4=0,faixa5=0;
		
		for (i=1;i<=15;){
		System.out.println("Digite a idade da pessoa "+i++);
		idade = buffer.nextInt();
		
		if ((idade>=1) && (idade<=15)){
		faixa1 = faixa1+1;
		}
		else if
		((idade>=16) && (idade<=30)){
		faixa2 = faixa2+1;
		}
		else if
		((idade>=31) && (idade<=45)){
		faixa3 = faixa3+1;
		}
		else if
		((idade>=46) && (idade<=60)){
		faixa4 = faixa4+1;
		}
		else if
		(idade >= 61){
		faixa5 = faixa5+1;
		}
		}
		
		System.out.println("A quantidade de pessoas na faixa etária 1 (1 a 15 anos) é: " +faixa1);
		System.out.println("A quantidade de pessoas na faixa etária 2 (16 a 30 anos) é: " +faixa2);
		System.out.println("A quantidade de pessoas na faixa etária 3 (31 a 45 anos) é: " +faixa3);
		System.out.println("A quantidade de pessoas na faixa etária 4 (46 a 60 anos) é: " +faixa4);
		System.out.println("A quantidade de pessoas na faixa etária 5 (61 anos ou mais) é: " +faixa5);
		System.out.println();
		System.out.println("A porcentagem de pessoas na faixa1 é igual à: " +((faixa1*100)/15)+"%");
		System.out.println("A porcentagem de pessoas na faixa2 é igual à: " +((faixa2*100)/15)+"%");
		System.out.println("A porcentagem de pessoas na faixa3 é igual à: " +((faixa3*100)/15)+"%");
		System.out.println("A porcentagem de pessoas na faixa4 é igual à: " +((faixa4*100)/15)+"%");
		System.out.println("A porcentagem de pessoas na faixa5 é igual à: " +((faixa5*100)/15)+"%");
			}
}


