package br.com.generation.exheranca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class ExLoja {

	
		public static void main(String[] args) {


			String p1 ="Celular";
			String p2 = "Televisão";
			String p3 ="Tablet";
			
			ArrayList<String> produtos = new ArrayList<>();
			produtos.add(p1);
			produtos.add(p2);
			produtos.add(p3);
			
			System.out.println("Lista de produtos: = "+ produtos);
			
			Scanner leia = new Scanner(System.in);
			System.out.println("Voce deseja adicionar ou remover?" + "\n1 - Adicionar"+ " \n2 - Remover");
			int r= leia.nextInt();
			
			if(r == 1){
					System.out.println("Nome do produto: ");
					String produto = leia.next();
					produtos.add(produto);
			}
			else if(r == 2){
					System.out.println("Qual produto você gostaria de remover:");
					int quantidade = produtos.size();
				//	System.out.println(quantidade);
					for(int i = 0; i< quantidade; i ++) {
						System.out.println((i + 1) +produtos.get(i));
					}
					System.out.println("Digite o número correspondente ao produto: ");
					int rProduto = leia.nextInt();
					produtos.remove(rProduto - 1);
					System.out.println();
					System.out.println("A nova lista é: " + produtos);
			}
			else { 
				System.out.println("Opção inválida");
			}
			Collections.sort(produtos);
			System.out.println("Produtos" + produtos);
			
			
			}
			


	}
	

