programa
{ inclua biblioteca Matematica -->mat 
	
	funcao inicio()
	{	real a,b,c,d,x,valorA,valorB,valorC,valorD
		
		escreva("Digite o quadro números: ")
		leia(a,b,c,d)

		valorA = mat.potencia(a, 2)
		valorB = mat.potencia(b, 2)
		valorC = mat.potencia(c, 2)
		valorD = mat.potencia(d, 2)
		se (valorC>=1000){
			escreva("\nO valor " + c + " elevado ao quadrado é: " + valorC)
		} senao {
			escreva("\nO valor " + a + " elevado ao quadrado é: " + valorA)
			escreva("\nO valor " + b + " elevado ao quadrado é: " + valorB)
			escreva("\nO valor " + c + " elevado ao quadrado é: " + valorC)
			escreva("\nO valor " + d + " elevado ao quadrado é: " + valorD)
			
		}
		
		}
	
	
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 267; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */