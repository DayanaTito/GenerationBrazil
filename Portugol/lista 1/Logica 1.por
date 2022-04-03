programa
{
	
	funcao inicio()
	{
		inteiro Idade, meses, dias
		
		escreva( " Digite sua idade em anos: ")
		leia(Idade) 

		escreva( Idade, " anos", ", quantos meses: ")
		leia(meses)

		escreva( Idade, " anos, ", meses, " meses", " e quantos dias: ")
		leia(dias)

		dias = (Idade*365) + (meses*30) + dias

		escreva("Sua idade em dias é ", dias ," dias")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 206; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */