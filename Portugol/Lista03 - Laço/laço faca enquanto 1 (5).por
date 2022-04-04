programa
{inclua biblioteca Util --> ut
//
/*
 * Faça um programa que mostre uma contagem na tela de 233 a 456, só que
contando de 3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando não estiver.
 */
	
	funcao inicio()
	{	inteiro soma_3 =  3, soma_5 = 5, contador = 233

	
		escreva("\nA contagem será inicializada....")

		faca {
			limpa()

			escreva("\nA contagem será inicializada....")
			
		se (contador>=300 e contador<=400){
			escreva("\n",contador)
			contador = contador + soma_3
		}senao{
			escreva("\n",contador)
			contador = contador + soma_5
		}
			ut.aguarde(750)
		}enquanto (contador<=456)
			escreva("\nFinalizado")
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 511; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */