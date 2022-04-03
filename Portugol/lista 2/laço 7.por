programa
{	
	
	real area,base, altura
	funcao inicio()
	{
		escreva("Digite o valor da base do triângulo ")
		leia(base)

		escreva("Digite o valor da altura do triângulo ")
		leia(altura)

		area = (base*altura)/2

		se (base>0 e altura>0){

		escreva("A área desse triângulo é: " + area)
		} senao {
			escreva("Não foi possível calcular a área")
		}
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 16; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */