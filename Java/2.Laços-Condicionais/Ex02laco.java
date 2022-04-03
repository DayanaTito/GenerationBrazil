package br.com.generation.java;
import java.util.Arrays;
import java.util.Scanner;

public class Ex02laco {
//2- Faça um programa que entre com três números e coloque em ordem crescente.
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int[]  n = new int[3];
		int x = 0;
		int i = 0;
		
		for(i = 0 ; i<3 ; i++) {
		
		System.out.println("Digite um número: ");
		n[i] = entrada.nextInt();
		
		
		}
		entrada.close();
		
		  Arrays.sort(n);
          
          // Lista o Array em ordem crescente
         System.out.print("Ordem crescente:    "); 
      	  for (x = 0 ; x < n.length; x++) 
      	  {
      		System.out.print(n[x]+ "  ");       		
		  }
      	  
      	 
}
}