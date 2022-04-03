package br.com.generation.java;

import java.util.Scanner;

public class Ex03laco {
//3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
//	categoria ela se encontra:
//		 10-14 infantil
//		 15-17 juvenil
//		 18-25 adulto
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite a sua idade: ");
		idade = entrada.nextInt();
		entrada.close();
		if (idade>=10 && idade<=14) {
			System.out.println("Você se encontra na categoria infantil");
		}if (idade>=15 && idade <= 17) {
			System.out.println("Você se encontra na categoria juvenil");
		} if(idade>=18 && idade<=25) {
			System.out.println("Você se encontra na categoria adulto");
		} else {
			System.out.println("A idade não corresponde a nenhuma categoria");
		}
	}

}
