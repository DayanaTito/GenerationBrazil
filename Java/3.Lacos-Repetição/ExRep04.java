package br.com.generation.repet;

import java.util.Scanner;

public class ExRep04 {

	public static void main(String[] args) {
//		4- Uma empresa desenvolveu uma pesquisa para saber as características
//		psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
//		era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
//		(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
//		agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
//		pessoas, calcule e mostre: (WHILE)
//		 o número de pessoas calmas;
//		 o número de mulheres nervosas;
//		 o número de homens agressivos;
//		 o número de outros calmos;
//		 o número de pessoas nervosas com mais de 40 anos;
//		 o número de pessoas calmas com menos de 18 anos.
		
		Scanner entrada = new Scanner(System.in);
		
		int idade;
		int comportamento;
		int populacao;
		int sexo;
		int c = 0;
		int mulhereNervosas = 0;
		int homensAgressivos = 0;
		int outrosCalmos = 0;
		int pessoasNervosasComMais40 = 0;
		int numeroPessoasCalmasComMenos18 = 0;
		
		System.out.println("Digite a quantidade de pessoas: ");
		populacao = entrada.nextInt();
		
		int i = 0;
		
		
		while(i<populacao) {
			i++;
			
			System.out.println("Qual a sua  idade: ");
			idade = entrada.nextInt();
			
			System.out.println("Qual seu sexo: "+"\n1 - Femenino"+"\n2 - Masculino"+"\n3 - Outros");
			sexo = entrada.nextInt();
			
			System.out.println("Você se considera: "+"\n1 - Calma"+"\n2 - Nervosa"+"\n3 - Agressiva");
			comportamento = entrada.nextInt();
			
		//o número de pessoas calmas;
			if(comportamento == 1) {
			c++;
		}
		//o número de mulheres nervosas;
		if(comportamento == 2 && sexo == 1) {
			mulhereNervosas++;
		}

		//o número de homens agressivos;
		if(comportamento == 3 && sexo == 2 ) {
			homensAgressivos++;
		}

		//o número de outros calmos;
		if(comportamento == 1 && sexo == 3 ) {
			outrosCalmos++;
		}

		//o número de pessoas nervosas com mais de 40 anos
		if(comportamento == 2 && idade >= 40) {
			pessoasNervosasComMais40++;
		}

		//o número de pessoas calmas com menos de 18 anos.
		if(comportamento == 1 && idade<18) {
			numeroPessoasCalmasComMenos18++;
		}
		}
		
		entrada.close();
		System.out.println("O número de pessoas calmas: " + c);
		System.out.println("O número de mulheres nervosas: " + mulhereNervosas);
		System.out.println("O número de homens agressivos: " + homensAgressivos);
		System.out.println("O número de outros calmos: " + outrosCalmos );
		System.out.println("O número de pessoas nervosas com mais de 40 anos: " + pessoasNervosasComMais40);
		System.out.println("O número de pessoas calmas com menos de 18 anos: "+ numeroPessoasCalmasComMenos18);
		
	
	}

}
