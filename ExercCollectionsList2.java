package ExercCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercCollectionsList2 {
	
	public static void main(String args[]) {

	Scanner leia = new Scanner(System.in);
	
	int numero;
	
	List<Integer> lista1 = new ArrayList<Integer>();
	
	lista1.add(2);
	lista1.add(5);
	lista1.add(1);
	lista1.add(3);
	lista1.add(4);
	lista1.add(9);
	lista1.add(7);
	lista1.add(8);
	lista1.add(10);
	lista1.add(6);
	
	System.out.println("Por favor, insira o número: ");
	numero = leia.nextInt();
	
	if (lista1.contains(numero)) {
		System.out.println("\n O número " + numero + " está na posição: " + lista1.indexOf(numero));
	}
	else {
		System.out.println("\n O número " + numero + " não foi encontrado!");
	}
	}
}