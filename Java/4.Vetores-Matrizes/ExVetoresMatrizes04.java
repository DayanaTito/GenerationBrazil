package br.com.generation.vetoresematrizes;

import java.util.Scanner;

public class ExVetoresMatrizes04 {

	public static void main(String[] args) {
//4. Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
//   em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
//   diagonal, ou seja, diagonal principal.
	Scanner entrada = new Scanner(System.in);
		
	int[][] valor = new int [3][3];
	int soma = 0;
	int somadiagonal = 0;
	System.out.println("Digite os valores da matriz: ");
	
	for (int l = 0; l <valor.length;l++) {
		for (int c = 0; c < valor[l].length;c++) {
			System.out.printf("Digite os valores na posição %d %d: " , l,c); /*posição na matriz*/
			valor[l][c] = entrada.nextInt();
		
			soma = soma + valor[l][c];
			
			if (valor[l] == valor[c]) {
				somadiagonal = somadiagonal + valor[l][c];
			}
		}
		System.out.println();
	}
	
	entrada.close();
	System.out.println("A soma de todos os valores é: " + soma);
	System.out.println("A soma da diagonal principal é: " + somadiagonal + "\n");
	
	System.out.println("Matriz 3x3:");

	// impressão da Matriz
	for(int l = 0; l < valor.length; l++) {
		//parado na linha [1]
		for(int c = 0; c < valor[l].length; c++) {
			System.out.print(valor[l][c] + " | ");
		}
		System.out.println();
	}
	
	}

}
