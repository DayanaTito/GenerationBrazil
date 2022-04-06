package br.com.generation.POO;

public class funcionariosMain {

	public static void main(String[] args) {
	
		funcionarios colaborador1 = new funcionarios();
		
		colaborador1.nome = "Douglas Rocha";
		colaborador1.funcao = "CEO";
		colaborador1.horasTrabalhadas = 120;
		colaborador1.minhoras = 100;
		colaborador1.valorhora = 10;
		
		colaborador1.funcionario();
		colaborador1.salario();
	}

}
