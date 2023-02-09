// escreva um algoritmo em Java que leia o código de um item (número inteiro de 1 a 6) e a quantidade comprada deste item (número inteiro). 
// A seguir, mostre na tela o valor total da conta e o nome do produto que foi comprado.

package aulajava;

import java.util.Scanner;

public class Lista2Exerc5 {
	
	public static void main(String[] args) {
	
	Scanner leia = new Scanner (System.in);
	
	int  quantidade, codigo;
	float valorTotal;
	
	System.out.println("\n\tMenu Lanchonete");
	System.out.println("\nSelecione o produto de acordo com seu código:");
	System.out.println("\n1 - Cachorro-quente");
	System.out.println("\n2 - X- Salada");
	System.out.println("\n3 - X-Bacon");
	System.out.println("\n4 - Bauru");
	System.out.println("\n5 - Refrigerante");
	System.out.println("\n6 - Suco de Laranja");
	
	System.out.println("\nDigite o código do produto: ");
	codigo = leia.nextInt();
	
	System.out.println("\nInsira a quantidade desejada do produto selecionado:");
	quantidade = leia.nextInt();
	
	switch (codigo){
	case 1:
		valorTotal = quantidade * 10;
		System.out.println("o valor total é: R$" +valorTotal);
	break;
	case 2:
		valorTotal = quantidade * 15;
		System.out.println("o valor total é: R$" +valorTotal);
	break;
	case 3:
		valorTotal = quantidade * 18;
		System.out.println("o valor total é: R$" +valorTotal);
	break;
	case 4:
		valorTotal = quantidade * 12;
		System.out.println("o valor total é: R$" +valorTotal);
	break;
	case 5:
		valorTotal = quantidade * 8;
		System.out.println("o valor total é: R$" +valorTotal);
	break;
	case 6:
		valorTotal = quantidade * 13;
		System.out.println("o valor total é: R$" +valorTotal);
	break;
	default:
		System.out.println("\n Opção Inválida");
	
	System.out.println("\nInsira a quantidade desejada do produto selecionado:");
	quantidade = leia.nextInt();
			
	System.out.println("\nO valor total dos produtos selecionados é:" + "valorTotal");
	
	}
}
}
	