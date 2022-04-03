package br.com.generation.jeffex;

import java.util.Scanner;

public class Ex01Ps {
//1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
//	dias e mostre-a expressa apenas em dias.
	
	public static void main(String[] args) {
		
	Scanner entrada = new Scanner (System.in);
	
	int idade, meses, dias, diasTotal;
	
	System.out.println("Digite a sua idade em anos: ");
	idade = entrada.nextInt();
	
	System.out.println( idade +" anos," + " quantos meses: ");
	meses = entrada.nextInt();
	
	System.out.println( idade +" anos, " + meses +" meses e quantos dias: " );
	dias = entrada.nextInt();
	
	diasTotal= (idade * 365) + (meses * 30) + dias;  

	System.out.println("Sua idade em dias é: "+ diasTotal + " dias");
	
	entrada.close();
			
	}

}
