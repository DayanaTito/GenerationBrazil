programa
{
//
/*
Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
posição das matrizes N1 e N2.
 */
	
	
	
	
	
	
	funcao inicio()
	{
	inteiro N1[4][6], N2[4][6], M1[4][6],M2[4][6]
// l = linha
// c = coluna
		para (inteiro l = 0; l<4; l++){
			para (inteiro c = 0; c<6; c++){
			limpa()
			escreva ("Digite o dado para a 1° matriz: ")
			
			leia(N1[l][c])
			}
		}

		//escreva ("A 1° matriz foi registerada com sucesso")
		
		para (inteiro l = 0; l<4; l++){
			para (inteiro c = 0 ; c<6; c++){
			limpa()
			
			escreva ("Digite o dado para a 2° matriz: ")
			leia(N2[l][c])

			limpa()
			}
		}
		
		//escreva ("A 2° matriz foi registrada com sucesso")
		//matriz M1

		
		escreva("Matriz M1\n")
		
		para (inteiro l = 0; l<4; l++){
			para (inteiro c = 0; c<6; c++){

				M1[l][c] = N2[l][c] + N1[l][c]
				
				escreva( M1[l][c] , ",")
			}
			escreva ("\n")
		}

			escreva ("\n")
		// Matriz M2

		
		escreva("Matriz M2\n")
		para (inteiro l = 0; l<4; l++){
			para (inteiro c = 0; c<6; c++){

				M2[l][c] = N2[l][c] - N1[l][c]
				
				
				escreva( M2[l][c], ",")
			}
			escreva ("\n")
		}

		//escreva ("\n")

		
		
		
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 401; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {N1, 19, 9, 2}-{N2, 19, 19, 2}-{M1, 19, 29, 2}-{M2, 19, 38, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */