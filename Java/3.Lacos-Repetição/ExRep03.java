package br.com.generation.repet;

import java.util.Scanner;

public class ExRep03 {

	public static void main(String[] args) {
	//3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
	//21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
	//idade for =-99. (WHILE)
		Scanner entrada = new Scanner(System.in);
		
		int idade = 0;
		int i = 0;
		int m = 0;
		
		while(idade != -99) {
			System.out.println("Digite a sua idade: ");
			idade = entrada.nextInt();
			
		if (idade<=21) {
			i++;
		}
		
		if (idade>=50) {
			m++;
		}
		
		}
		
		System.out.println("Total de pessoas com menos de 21 anos: " + i);
		System.out.println("Total de pessoas com mais de 50 anos: " + m);
	}

}
