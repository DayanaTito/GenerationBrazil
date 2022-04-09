package br.com.generation.POO;



public class cliente {
	
	/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
	esta classe, em seguida crie um objeto cliente, defina as instancias deste
	objeto e apresente as informações deste objeto no console.*/
	 
	String nome;
	String dataDeNacimento;
	String CPF;
	String cadastro;
	double extrato;
	double compras;
	
	void registro () {
			
		cadastro = "\nNome completo: " + nome + "\nCPF: " + CPF + "\nData de nascimento: " + dataDeNacimento;   
		System.out.println("O seu cadastro completo é: " + "\n"+cadastro);
	}
	
	void compras() {
		extrato = compras + extrato;
		System.out.println("\nSeu extrato é: R$" + extrato);
	}
}
