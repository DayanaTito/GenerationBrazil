programa
{
	
	funcao inicio()
	{	inteiro valor_Numero = 0 , soma_Numero = 0, media_Numero = 0 , total_Numeros_Lidos=0,i,z=0
	
		escreva("O valor do número: ")
		leia(valor_Numero)
	
		enquanto(valor_Numero>=0){
			soma_Numero = valor_Numero + soma_Numero
			z++
			escreva("O valor do número: ")
			leia(valor_Numero)
		
				total_Numeros_Lidos = z + total_Numeros_Lidos
				media_Numero = soma_Numero/z
		}

		

		escreva("A total da soma é "+soma_Numero)
		escreva("\nA média é igual a "+media_Numero)
		escreva("\nTotal de valores lidos "+z)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 540; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */