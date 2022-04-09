package br.com.generation.POO;

public class produtoEletronicoMain {

	public static void main(String[] args) {
		
		produtoEletronico p1 = new produtoEletronico();
		produtoEletronico p2 = new produtoEletronico();
		
		p1.nomeProduto = "Samsung Galaxy Note 10+";
		p1.armazenamento = "256 GB";
		p1.RAM = "12GB";
		p1.valor = 3000.00;
		p1.dadosmoveis = "4G";
		
		p1.descricao();
		p1.promoção();

		p2.nomeProduto = "Samsung Galaxy Note 10";
		p2.armazenamento = "128 GB";
		p2.RAM = "8GB";
		p2.valor = 2000.00;
		p2.dadosmoveis = "4G";
		
		p2.descricao();
		p2.promoção();

		

	}

}
