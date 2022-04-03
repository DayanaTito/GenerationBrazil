programa
{	inclua biblioteca Matematica -->mat
	
	funcao inicio()
	{
		real d, x1, x2, y1,y2, a, b,c, y, z
		
		escreva("Digite o primiero ponto no plano x,y: ")
		leia(x1,y1)
		
		escreva("\nDigite o segundo ponto no plano x,y: ")
		leia(x2,y2)

		y = x2 - x1
		z = y2 - y1

		a = mat.potencia(y, 2)
		b = mat.potencia(z, 2)
		
		c = a + b

		d = mat.raiz(c, 2)
		

		escreva( "\nA distância entre os pontos é ",d)
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 362; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */