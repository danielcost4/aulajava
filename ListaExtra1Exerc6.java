//Escrever um programa que receba vários números inteiros no teclado.
//E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).

package aulajava;

import java.util.Scanner;

public class ListaExtra1Exerc6 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int x, somaTotal = 0, denominador = 0;
		float resultado;
		
		do {
				System.out.println("Por favor, insira um número");
				
				x = leia.nextInt();
				
				if (x%3 == 0 && x!= 0) {
					somaTotal +=x;
					denominador++;
				}
		}while (x != 0);
		
		resultado = somaTotal/denominador;
		
		System.out.println("\nA média dos múltiplos de 3 digitados é: " + resultado);
				
	}
}