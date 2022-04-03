programa
{//
/*
4 - Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.
 */
	
	funcao inicio()
	{	inteiro dados[3][3], soma_dados=0, soma_diagonal_principal = 0
// l = linha
// c = coluna
		para(inteiro l =0; l<3;l++){
			para(inteiro c = 0; c<3; c++){
				limpa()
				escreva("Digite o valor: ")
				leia(dados[l][c])

				soma_dados = soma_dados + dados[l][c]
				
				se (l==c){

					soma_diagonal_principal = dados[l][c] + soma_diagonal_principal
				}
			}
		}
		escreva("\nSoma dos valores da matriz: " + soma_dados)
		escreva("\n"+"\nA soma da primeira diagonal: " + soma_diagonal_principal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 366; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {dados, 10, 11, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */