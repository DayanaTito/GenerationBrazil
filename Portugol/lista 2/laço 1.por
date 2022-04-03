programa
{
	
	funcao inicio()
	{
		real pesoTomates,pesoMax,pesoExcesso, valorMulta, multa
		 
		
		escreva("Digite o peso dos tomates: ")
		leia(pesoTomates)

		multa = 4
		pesoMax = 50
		pesoExcesso = pesoTomates - pesoMax

		valorMulta = pesoExcesso * multa
		
		se (pesoTomates>=pesoMax){
			escreva("O peso excedeu: " + pesoExcesso," Kg" ," e a multa que você deverá pagar é no valor de: " + " R$ " + valorMulta )
		} senao {
			
			valorMulta = 0
			pesoExcesso = 0
			
			escreva("O peso excedeu: " + pesoExcesso, " Kg" ,"\nA multa que você deverá pagar é igual: R$" + valorMulta )
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 529; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */