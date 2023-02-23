//Escreva um algoritmo em Java, que leia números inteiros via teclado, até que o número zero seja digitado. Ao final, mostre na tela a média de todos os números digitados, que sejam múltiplos de 3.

package aulajava;

import java.util.Scanner;

public class Lista3Exerc6 {

	public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);

	int i, soma = 0, quant = 0, media;

	do
	{
		System.out.println("\nPor favor, insira um número");
		i = leia.nextInt();
		if (i % 3 == 0 && i!=0) {
			soma += i;
			quant++;
		}
	}while(i!=0);
	
	media = soma/quant;
			
	System.out.println("\nA média dos números inseridos que são múltiplos de 3 é: " + media);

	}
	}