package br.com.generation.repet;

import java.util.Scanner;


public class ExRep06 {

	public static void main(String[] args) {
//	6- Escrever um programa que receba vários números inteiros no teclado. E no
//	final imprimir a média dos números múltiplos de 3. Para sair digitar
//	0(zero).(DO...WHILE)

		Scanner entrada = new Scanner(System.in);
		
		int n;
		int media;
		int soma = 0;
		int i = 0;
		System.out.println("Digite um número: ");
		
		do {
			n = entrada.nextInt();
			if(n%3==0 && n!=0)  {
				i++;
				soma = n + soma;
			}
			
		} while (n != 0);
		media = soma/i;
		
		System.out.println("A média dos número multiplos de 3 são: " + media );
	}

}
