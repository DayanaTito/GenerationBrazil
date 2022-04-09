package br.com.generation.exheranca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class ExLoja {

	
	public static void main(String[] args) {

			Scanner entrada = new Scanner(System.in);

			String p1 ="Celular";
			String p2 = "Televisão";
			String p3 ="Tablet";
			
			ArrayList<String> produtos = new ArrayList<>();
			produtos.add(p1);
			produtos.add(p2);
			produtos.add(p3);
			
			System.out.println("Lista de produtos: "+ produtos);
			
			System.out.println("Escolha uma opção: " + "\n1 - Adicionar"+ " \n2 - Remover");
			int r= entrada.nextInt();
			
			if(r == 1){
					System.out.print("Digite o nome no produto: ");
					String produto = entrada.next();
					produtos.add(produto);
					System.out.println("Lista de Produtos: " + produtos);
			}
			else if(r == 2){
				System.out.println("==========| Lista de Produtos |==========");
				for(int i = 0; i< produtos.size(); i ++) {
					System.out.println((i + 1) + " - " + produtos.get(i));
				}
				System.out.println("=========================================");
					System.out.print("Digite o código do produto: ");
					int rProduto = entrada.nextInt();
					produtos.remove(rProduto - 1);
					System.out.println("\nLista de produtos: " + produtos);
			}
			else { 
				System.out.println("Opção inválida");
			}
		
			}
	}
	

