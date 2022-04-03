programa
{
	
	funcao inicio()
	{
		real a, b, c, d, E, f,x,y

		escreva("Digite o valor de ax, by, dx e ey: ")
		leia (a,b,d,E)

		c = a + b
		f = d + E

		x = ((c*E)-(b*f)/(a*E)-(b*d))
		y = ((a*f)-(c*d)/(a*E)-(b*d))

		escreva("O valor de x é: ", x, " e o valor de y é: ", y )
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 293; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */