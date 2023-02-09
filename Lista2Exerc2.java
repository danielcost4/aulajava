//Escreva um algoritmo em Java, que leia um número inteiro via teclado e mostre na tela uma mensagem indicando se este número é par ou ímpar e se o número é positivo ou negativo. Veja os exemplos abaixo:

package aulajava;

import java.util.Scanner;

public class Lista2Exerc2 {

	public static void main(String[] args) {
	
		int numero, par = 2;
		
	Scanner leia = new Scanner (System.in);
	
	System.out.println("\n Insira um número inteiro:");
	numero = leia.nextInt();
	
	if (numero > 0 && numero % 2 == 0) {
		System.out.println("\n o número é positivo e par");	
	}
	else if (numero < 0 && numero % 2 == 0) {
		System.out.println("\n o número é negativo e par");
	}
	else if (numero < 0 && numero % 2 != 0) {
		System.out.println("\n o número é negativo e ímpar");
	}
	else if (numero > 0 && numero % 2 != 0) {
		System.out.println("\n o número é positivo e ímpar");
	}
}
}
