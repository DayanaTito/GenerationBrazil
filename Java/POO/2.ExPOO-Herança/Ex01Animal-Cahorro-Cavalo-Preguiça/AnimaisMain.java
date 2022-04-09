package br.com.generation.exheranca;

public class AnimaisMain {

	public static void main(String[] args) {
		
		Cachorro Beethoven = new Cachorro();
		Cavalo C1 = new Cavalo ();
		Preguica P1 = new Preguica();
		
		Beethoven.setNome("Beethoven");
		Beethoven.setIdade(16);
		Beethoven.dados();
		Beethoven.correr();
		
		C1.setNome("Cavalo");
		C1.setIdade(5);
		C1.dados();
		C1.correr();
		
		P1.setNome("Preguiça");
		P1.setIdade(2);
		P1.dados();
		P1.correr();
		
	}

}
