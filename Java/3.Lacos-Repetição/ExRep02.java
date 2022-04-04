package br.com.generation.repet;

import java.util.Scanner;

public class ExRep02 {
//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int n ;
		int i;
		int x = 0;
		int p = 0;
		
		for (i = 0; i<10;i++) {
			int y = 0; 
			y++;
			System.out.println("Digite o " + y +"°" + " número: ");
			 n = entrada.nextInt();	
		if(n % 2 == 1) {
			x++;
		}else {
			p++;
		}
		}
		entrada.close();
		System.out.println(x +" número são ímpares. ");
		System.out.println(p +" número são pares. ");
	}

}
