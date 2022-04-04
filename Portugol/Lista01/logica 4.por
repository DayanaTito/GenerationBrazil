programa
{	inclua biblioteca Matematica -->mat
	funcao inicio()
	{
		inteiro A, B, C
		real R, S, D, x, y
		
		escreva("Digite três números inteiros: ")
		leia(A,B,C)

		x = A + B
		y = B + C
		
		R = mat.potencia( x, 2)
		
		S = mat.potencia( y, 2)
		
		D = ( (R + S) /2)
		
		escreva(" o valor de D é: ", D)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 290; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */