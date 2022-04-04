package br.com.generation.repet;

import java.util.Scanner;

public class ExRep05 {

	public static void main(String[] args) {
	//	5 - Crie um programa que leia um número do teclado até que encontre um
	//	número igual a zero. No final, mostre a soma dos números
	//	digitados.(DO...WHILE)
		
		Scanner entrada = new Scanner(System.in);
		
		float n;
		float soma = 0;
		
		System.out.println("Digite um número: ");
		
		do { 
			n = entrada.nextFloat();
			soma = n + soma;
			
		}
		while( n != 0 ); 
			
		System.out.printf("Soma: %.1f", soma);
	}

}
