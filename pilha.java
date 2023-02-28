//Escreva um programa Java contendo uma Collection Stack (Pilha) de Objetos da Classe String, para organizar a retirada de livros em uma pilha. O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:

package exerciciosarrays;

import java.util.Scanner;
import java.util.Stack;

public class pilha {

	public static void main(String[] args) {	

		Scanner leia = new Scanner(System.in);

		int op;
		String nomeLivro;	

		Stack<String> pilha = new Stack<String>();
		
		do {
			System.out.println("\n----------------------------------------------------");
			System.out.println("\n1) Adicionar um novo livro na pilha");
			System.out.println("\n2) Listar todos os livros");
			System.out.println("\n3) Retirar um Livro da pilha");
			System.out.println("\n0) Sair");
			System.out.println("\n----------------------------------------------------");
			System.out.println("Por favor, digite sua opção:");
			op = leia.nextInt();

			switch (op) {
			case 1:
				System.out.println("\nInsira o nome do livro");
				leia.skip("\\R?");
				nomeLivro = leia.nextLine();
				pilha.push(nomeLivro);
				System.out.println("\nPilha:" + pilha + "\nLivro adicionado à pilha!");
				break;

			case 2:
				System.out.println("\nLista de livros na pilha: " + pilha);
				break;

			case 3:
				if (pilha.isEmpty()) 
					System.out.println("A pilha já está vazia!");
				else 
					System.out.println("Retirado da pilha: " + pilha.pop());	
				break;
				
			case 0:
				System.out.println("Obrigado por utilizar nosso sistema!");
				break;
			}
	}while(op!=0);
}
}