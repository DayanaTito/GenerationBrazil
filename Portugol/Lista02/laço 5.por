programa
{ 
	funcao inicio()
	{	real indicePoluicao
	
		escreva("Digite o índice de poluição: ")
		leia(indicePoluicao)
		
		se (indicePoluicao>=0.05 e indicePoluicao<=0.29){
			escreva ("o índice de poluição está de acordo com o aceitável")
		}senao se ( indicePoluicao<=0.39 e indicePoluicao>=0.3 ){
			escreva("ATENÇÃO! Industrias do 1º grupo suspender suas atividades.")
		} senao se ( indicePoluicao>=0.4 e indicePoluicao<=0.49){
			escreva("ATENÇÃO! Industrias do 1º grupo e 2º grupo suspender suas atividades.")
		}senao se( indicePoluicao>=0.5) {
			escreva("ATENÇÃO! Todas as indústrias devem suspender suas atividades.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 634; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 */