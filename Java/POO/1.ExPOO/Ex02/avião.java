package br.com.generation.POO;
/*2) Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

public class avião {

	String numeroDoVoo;
	String passageiro;
	String dataviagem;
	String RG;
	String destino;
	
	void dadosPassageiroVoo() {
		
		System.out.println("Olá," + passageiro + "!" );
		System.out.println("\nSua viagem está marcada para "+ dataviagem); 
		System.out.println("O número do seu voo é: " + numeroDoVoo);
		System.out.println("Seu destino é: " + destino );
		System.out.println("\nTenha uma excelente viagem!");
	}
	
	
}
