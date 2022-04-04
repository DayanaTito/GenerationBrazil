programa
{
	
	funcao inicio()
	{
		inteiro n1, resultado
		real decimal
	
		escreva("Digite um número: ")
		leia(n1)

		
		se (n1<=0){
			
			 escreva(" \nEste número é: " + n1)
		}
		
		senao se (  n1 % 2 == 0) {
			escreva("Este número é par")
		} senao {
			escreva("Este número é ímpar")
		}
		
		se (n1<0) {
			
		escreva(" \nEste número é netagivo")
		} senao {
			escreva(" \nEste número é positivo")
		} 
		
		se (n1==0) {
			n1 = 0
			escreva(" \nEste número é: " + n1)
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 138; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */