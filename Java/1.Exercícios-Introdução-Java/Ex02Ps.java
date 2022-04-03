package br.com.generation.jeffex;
import java.util.Scanner;
public class Ex02Ps {
//2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
//	 expressa em anos, meses e dias.
	
	public static void main(String[] args) {
		
	int	anos,dias;
	double meses, dias1;
	Scanner entrada = new Scanner(System.in);
	
	
	System.out.println("Qual a sua idade em dias: ");
	dias = entrada.nextInt();
	
	anos = dias / 365;
	dias = dias%365;
	meses = dias/30;
	dias = dias%30;
	
	dias1 = dias;
	
	entrada.close();
	
	System.out.println(anos + " anos");
	System.out.println(meses + " meses");
	System.out.println(dias1 + " dias");
	
			
	}

}
