package br.edu.fameg.ads.aed.lista2;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {

		/*
		* Escreva um Programa que receba a idade de 15 pessoas, calcule e imprima: 
		- a quantidade de pessoas em cada faixa et�ria; a porcentagem de cada faixa et�ria em rela��o ao total de pessoas. 
		As faixas et�rias s�o:
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
		
		System.out.println("A quantidade de pessoas na faixa et�ria 1 (1 a 15 anos) �: " +faixa1);
		System.out.println("A quantidade de pessoas na faixa et�ria 2 (16 a 30 anos) �: " +faixa2);
		System.out.println("A quantidade de pessoas na faixa et�ria 3 (31 a 45 anos) �: " +faixa3);
		System.out.println("A quantidade de pessoas na faixa et�ria 4 (46 a 60 anos) �: " +faixa4);
		System.out.println("A quantidade de pessoas na faixa et�ria 5 (61 anos ou mais) �: " +faixa5);
		System.out.println();
		System.out.println("A porcentagem de pessoas na faixa1 � igual �: " +((faixa1*100)/15)+"%");
		System.out.println("A porcentagem de pessoas na faixa2 � igual �: " +((faixa2*100)/15)+"%");
		System.out.println("A porcentagem de pessoas na faixa3 � igual �: " +((faixa3*100)/15)+"%");
		System.out.println("A porcentagem de pessoas na faixa4 � igual �: " +((faixa4*100)/15)+"%");
		System.out.println("A porcentagem de pessoas na faixa5 � igual �: " +((faixa5*100)/15)+"%");
			}
}


