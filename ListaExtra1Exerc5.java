//Crie um programa que leia um número do teclado até que encontre um número igual a zero.
//No final, mostre a soma dos números digitados.

package aulajava;

import java.util.Scanner;

public class ListaExtra1Exerc5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int x, resultado = 0;
		
		do {
				System.out.println("Por favor, insira um número");
				
				x = leia.nextInt();
				
				resultado += x;
				
		}while (x != 0);
		
		System.out.println("\nA soma dos números digitados é: " + resultado);
		
		

		
		
		
	}
}