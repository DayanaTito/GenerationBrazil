package br.com.generation.jeffex;
import java.util.Scanner;
public class Ex03Ps {
//3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
//	expressa em segundos e mostre-o expresso em horas, minutos e segundos.
	
	public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);

	int seg;
	int hrs;
	int min;
	int seg1;
	
	System.out.println("Digite o tempo de duração em segundo: ");
	seg = entrada.nextInt();
	
	hrs = seg/3600;
	seg = seg%3600;
	min = seg/60;
	seg = seg%60;
	seg1 = seg;
	entrada.close();
	
	System.out.println("O tempo de duração é: " + hrs + " hora(as), " + min + " minutos e " + seg1 +" segundos.");
	
	}

}
