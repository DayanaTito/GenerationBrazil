programa
{//
/*
*Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
 atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
 */
	
	funcao inicio()
	{	real notas[5], maior_nota = 0.0
		inteiro  c=0

		para(inteiro i = 0; i <=4 ; i++){
		limpa()
		escreva("Digite a nota: ")
		leia (notas[i])
		limpa()
		}

		para (inteiro i = 0; i <=4 ; i++){
		c++ // contador de numero de dados
		escreva("\n",c,"° nota inserida "+notas[i])

		se (maior_nota<notas[i]){

			maior_nota = notas [i]
		}
			
		}

		escreva("\n","\nA maior nota é " + maior_nota)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 359; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */