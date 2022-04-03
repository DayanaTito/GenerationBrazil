package br.com.generation.jeffex;
import java.lang.Math;
import java.util.Scanner;

public class Ex04Ps {
//	4. Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
//	calcule a seguinte expressão:
//d=r+S/2; r =(a+b)²; s=(b+c)²	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		double a;
		double b;
		double c;
		double r;
		double s;
		double d;
		
		System.out.println("Digite o valor inteiro de A: ");
		a = entrada.nextDouble();
		
		System.out.println("Digite o valor inteiro de B: ");
		b = entrada.nextDouble();
		
		System.out.println("Digite o valor inteiro de C: ");
		c = entrada.nextDouble();
		entrada.close();
		r = (a + b);
		r = Math.pow(r, 2);
		
		s = (b + c);
		s = Math.pow(s,2);
		
		d = (r + s)/2;
		
		System.out.println("O valor de d é " + d);
		
		
		
	}

}
