//Faça um algoritmo em Java que leia 3 valores inteiros A, B e C e imprima na tela se a soma de A + B é maior, menor ou igual a C

package aulajava;

import java.util.Scanner;

public class Lista2Exerc1 {

	public static void main(String[] args) {

		int A, B, C;

		Scanner leia = new Scanner(System.in);

		System.out.println("\n Insira o valor A");

		A = leia.nextInt();

		System.out.println("\n Insira o valor B");

		B = leia.nextInt();

		System.out.println("\n Insira o valor C");

		C = leia.nextInt();
		
		if (A + B < C) {
			System.out.println("\n A soma de A e B é MENOR que C");
		}
		else if (A + B > C) {
			System.out.println("\n A soma de A e B é MAIOR que C");
		}
		else {
			System.out.println("\n A soma de A e B é IGUAL a C");
		}
	}
}