programa
{//
/** 
Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.
 */
	
	funcao inicio()
	{	inteiro dados[10], maior_dados = 0, media_dados = 0, soma_dados = 0, z=0,c 	=0

		para(inteiro i = 0; i<10;i++){
			limpa()
			escreva("Digite o valor ")
			leia(dados[i])
			limpa()
			
		} para (inteiro i = 0; i<10;i++){
			c++
			escreva("\n", c ,"° valor inserido "+ dados[i])

			soma_dados = soma_dados + dados[i]
			media_dados = soma_dados/c

			se (maior_dados<dados[i]){

				maior_dados = dados[i]	

				z=0
				}

			se (maior_dados == dados[i]){
			
			z++
		}
			} 


		escreva("\n","\nA média dos dados é " + media_dados)
		escreva("\n","\nO maior dado apareceu " + z + " vezes")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 514; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {c, 11, 77, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */