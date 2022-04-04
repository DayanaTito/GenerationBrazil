programa
{
	
	funcao inicio()
	{ cadeia codigo 
	  real horas, salario, salarioExtra, valorHora,horasExcesso,horasMax, salarioTotal, valorHoraExtra
	  	escreva("Digite o código do colaborador: ")
	  	leia (codigo)
		escreva("Digite o total de horas trabalhadas: ")
		leia(horas)
		
		horasMax = 50
		valorHora = 10 
		valorHoraExtra = 20
	
		horasExcesso =  horas - horasMax se (horasExcesso <= 0){
			horasExcesso = 0
		}
		
		salarioExtra = horasExcesso * valorHoraExtra
		salario = horas * valorHora
	
		salarioTotal = salario + salarioExtra

		escreva ( "Seu salário total é no valor de: ", "R$ " + salarioTotal, "\nO seu sálario em  excedente é de: ", "R$ " + salarioExtra)

		 
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 686; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */