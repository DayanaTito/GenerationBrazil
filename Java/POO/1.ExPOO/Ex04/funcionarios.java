package br.com.generation.POO;
/*4) Crie uma classe funcionário e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto funcionário, defina as
instancias deste objeto e apresente as informações deste objeto no
console.*/
public class funcionarios {

	String nome;
	String funcao;
	double horasTrabalhadas;
	double valorhora;
	double salario;
	double minhoras;
	double horasextras;
	double salarioextra;
	
	void funcionario() {
		System.out.println("Dados do colaborador: ");
		System.out.println("\nNome: " + nome);
		System.out.println("Função: " + funcao);
	}
	void salario() {
		
		if(horasTrabalhadas>minhoras) {
			horasextras = horasTrabalhadas - minhoras;
			salarioextra = (2*valorhora) * horasextras;
			
			System.out.println("\nVocê Possui horas extras!!!");
		}else {
			
		}
		
		salario = (valorhora * horasTrabalhadas) + salarioextra;
		
		System.out.println("Seu salário é: R$" + salario);
	}
}
