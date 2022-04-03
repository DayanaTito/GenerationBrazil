package br.com.generation.java;

import java.util.Scanner;

public class Ex04laco {
//	Faça um programa em que permita a entrada de um número qualquer e exiba se este
//	número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
//	ímpar exiba o número elevado ao quadrado.
	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);	
	
	double valor;
	
	System.out.println("Digite um número: ");
	valor = entrada.nextInt();
	entrada.close();
	if(valor % 2 == 0) {
		System.out.println("Este número é par");
		valor = Math.sqrt(valor);
		System.out.println("A raiz quadrada desse número é " + valor );
	}else {
		System.out.println("Este número é ímpar");
		valor = Math.pow(valor, 2);
		System.out.println("Este número elevado ao quadrado é " + valor);
	} if(valor == 0) {
		System.out.println("Valor neutro!");
	}
	
	}

}
