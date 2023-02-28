package exerciciosarrays;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class fila {

	 {
			
			Scanner leia = new Scanner(System.in);
			
			int op;
			String nome;
		
			Queue<String> fila = new LinkedList<String>();
			
			do {
				System.out.println("\n----------------------------------------------------");
				System.out.println("\n1) Deseja adicionar um cliente à fila?");
				System.out.println("\n2) Deseja listar os clientes na fila?");
				System.out.println("\n3) Deseja chamar um cliente?");
				System.out.println("\n0) Deseja sair do sistema do estoque?");
				System.out.println("\n----------------------------------------------------");
				System.out.println("Por favor, digite sua opção:");
				op = leia.nextInt();
				
				switch (op){
			
			case 1: //Adicionar o cliente na lista
			System.out.println("\n Insira o nome do cliente:");
			nome = leia.next();
			fila.add(nome);
			System.out.println("\n Adicionando " + nome + " à fila");
			break;
			
			case 2: //Listar todos os clientes na fila
			System.out.println("\nLista de clientes na fila: "+ fila);
			break;
			
			case 3: //Chamar cliente (remover da fila)
	
			System.out.println("\nChamando cliente: "+fila.remove());
			break;
			
			case 0: //O programa deve ser finalizado. 
				System.out.println("Obrigado por utilizar nosso sistema!");
			break;
				}
			}while (op != 0);
}
}