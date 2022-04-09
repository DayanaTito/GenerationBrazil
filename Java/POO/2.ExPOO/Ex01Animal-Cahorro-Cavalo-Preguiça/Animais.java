package br.com.generation.exheranca;

public class Animais {
	
	private String nome;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	void dados() {
		System.out.println("\nNome: " + getNome());
		System.out.println("Idade: " + getIdade() + " anos");
	}
	
	void correr() {
		System.out.println("Está correndo..........");
	}
	
	
}
