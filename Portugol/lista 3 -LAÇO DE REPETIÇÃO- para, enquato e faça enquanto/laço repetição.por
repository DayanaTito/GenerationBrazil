programa
{
	
	funcao inicio()
	{
inteiro populacao,filhos, total_filhos = 0,total_sal = 0,i,media_filhos, percentual_salario=0,z=0

real salario, maior_salario = 0, media_salario



escreva("Qual a populacao da cidade..: ")
leia(populacao)

para (i = 1 ; i <= populacao; i++) {

			
			escreva("\n Qual o seu salario.........: R$ ")

			leia(salario)

			escreva("\n Qual a quantia de filhos...: ")

			leia(filhos)

			/* Soma dos salarios */

			total_sal = salario + total_sal
			

			/* Soma dos filhos */

			total_filhos = total_filhos + filhos
			

			/* Maior salario */

			se (maior_salario < salario) {

				maior_salario = salario

			}

			

			
			se (salario <= 100) {

				percentual_salario = ( z * 100)

				z++

			}
			
		}
		media_salario = total_sal/populacao
		media_filhos = total_filhos/ populacao

		escreva("\n A media do salario da populacao e " + media_salario)

		escreva("\nA media do numero dos filhos e " + media_filhos)

		escreva("\n O maior salario e " + maior_salario)

		escreva("\n O percentual das pessoas com salarios ate R$ 100,00 e " + percentual_salario +"%")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 287; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */