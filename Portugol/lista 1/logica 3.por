programa
{
	
	funcao inicio()
	{

		real seg, min, hr

		
		escreva("Digite o tempo em segundos: ")
		leia(seg)

		min = seg / 60
		hr = seg/3600

		escreva( "Sua idade em horas é ", hr, " Horas")
		escreva( "\nSua idade em minutos é ", min, " min")
		escreva( "\nSua idade em segundos é ", seg, " s")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 199; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */