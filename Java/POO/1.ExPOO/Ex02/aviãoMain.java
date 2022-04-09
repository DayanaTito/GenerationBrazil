package br.com.generation.POO;

public class aviãoMain {

	public static void main(String[] args) {
		
		avião passageiro = new avião();
		
		passageiro.dataviagem = "26/12/2022";
		passageiro.passageiro = "Dayana Tito";
		passageiro.RG = "60.986.897-8";
		passageiro.numeroDoVoo = "0736";
		passageiro.destino = "La paz - Bolívia";
		
		passageiro.dadosPassageiroVoo();
		
	
	}
	
}
