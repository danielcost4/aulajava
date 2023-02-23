/* Escreva um algoritmo em Java, que leia 2 números inteiros via teclado, onde o primeiro número deve ser menor do que o segundo número. 
Caso contrário, deve ser exibida uma mensagem na tela informando que o intervalo é inválido e sair do programa.
Dentro do intervalo informado, mostre na tela todes os números que são múltiplos de 3 e 5 */

package aulajava;

import java.util.Scanner;

public class Lista3Exerc1 {

	public static void main(String[] args) {

		int n1, n2;
		int i;

		Scanner leia = new Scanner(System.in);

		System.out.println("Insira o primeiro número do intervalo");

		n1 = leia.nextInt();

		System.out.println("Insira o segundo número do intervalo");

		n2 = leia.nextInt();

		for (i = n1; i <= n2; i++) {

			if (n1 > n2) {
				System.out.println("Intevalo inválido!");
			}

			else if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + " é múltiplo de 3 e de 5!");
			}
		}
	}
}