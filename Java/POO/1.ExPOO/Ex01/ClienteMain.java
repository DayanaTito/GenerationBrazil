package br.com.generation.POO;



public class ClienteMain {

	public static void main(String[] args) {
		
		
		
		cliente primeiroCliente = new cliente();
		
		primeiroCliente.nome = "Dayana Tito ";
		primeiroCliente.CPF = "221.579.323 - 67";
		primeiroCliente.dataDeNacimento = "08/10/1997";
		primeiroCliente.extrato = 0;
		
		primeiroCliente.compras = 300;
		
		primeiroCliente.registro();
		primeiroCliente.compras();
		
	}

}
