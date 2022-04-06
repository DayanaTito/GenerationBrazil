package br.com.generation.POO;
/*3) Crie uma classe produto eletrônico e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto produto eletrônico,
defina as instancias deste objeto e apresente as informações deste objeto
no console.*/

public class produtoEletronico {

	double valor;
	String nomeProduto;
	String RAM;
	String armazenamento;
	double promocao = 0;
	String dadosmoveis;
	
	void descricao() {
		System.out.println("Dados do produto: ");
		System.out.println("\nO seu produto é: " + nomeProduto + " " + dadosmoveis );
		System.out.println("Capacidade de armazenamento: " + armazenamento);
		System.out.println("Memória RAM: " + RAM);
		
	}
	void promoção () {
		if(valor>=3000) {
			promocao = valor - (valor* 0.10);
			System.out.println("\nEste produto está na promoção e o novo valor é " + promocao);
			System.out.println();
		}else {
			System.out.println("Infelizmente este produto não está na promoção.");
		}
	}
	
}
