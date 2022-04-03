package br.com.generation.jeffex;

import java.util.Scanner;

public class Ex07Ps {
//7. Um sistema de equações lineares do tipo:
// ax + by = c
// dx + ey= f
	
//x = ce - bf/ ae - bd
//y = af - cd/ ae - bd

	//, pode ser resolvido segundo mostrado abaixo :

//Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os
//valores de x e y.
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int x;
		int y;
		
	 System.out.println("Digite o valor de a ");
	 a = entrada.nextInt();
	 System.out.println("Digite o valor de b ");
	 b  = entrada.nextInt();
	 System.out.println("Digite o valor de c ");
	 c  = entrada.nextInt();
	 System.out.println("Digite o valor de d ");
	 d = entrada.nextInt();
	 System.out.println("Digite o valor de e ");
	 e  = entrada.nextInt();
	 System.out.println("Digite o valor de f ");
	 f = entrada.nextInt();
	 
	 entrada.close();
	 
	 x = ((c*e)-(b*f))/((a*e)-(b*d));
	 y = ((a*f)-(c*d))/((a*e)-(b*d));
	 
	 System.out.println("O valor de x é " + x + " e o valor de y é " + y);
	}

}
