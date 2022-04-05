package br.com.generation.vetoresematrizes;

import java.util.Scanner;

public class ExVetoresMatrizes01 {

	public static void main(String[] args) {
//1. Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
//   atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
	
		Scanner entrada = new Scanner(System.in);
		
	int i;	
	double maior = 0;
	double[] valores = new double[5];
	int n = 0;	
	
	for(i = 0; i<5; i++) {
		n++;
		System.out.print("Digite o " + n +"° nota: " );
		
		valores[i] = entrada.nextDouble();
		
		if(maior<valores[i]) {
			maior = valores[i];
		}
	}
	entrada.close();
	System.out.println();
	for(i=0;i<5;i++) {
		System.out.println("posição: " + i + "|" + valores[i]);
	}
	System.out.println("\nA maior pontuação é " + maior);
	}

}
