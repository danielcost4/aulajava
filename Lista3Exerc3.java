// Escreva um algoritmo em Java, que leia a idade de várias pessoas (números inteiros), via teclado e mostre na tela o total de pessoas cuja idade seja menor que 21 anos e o total de pessoas cuja idade seja maior que 50 anos. A leitura dos dados deve ser finalizada ao digitar uma idade negativa. Veja o exemplo abaixo:


package aulajava;

import java.util.Scanner;

public class Lista3Exerc3 {
		
		public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int i = 1, somaMenos21 = 0, somaMais50 = 0;
		
		while (i >= 0) {
			
			System.out.println("Por favor, insira a idade da pessoa (um número negativo encerrerá o programa):");			
			i = leia.nextInt();
			
			if (i<21 && i>0) {
				somaMenos21 +=1;	//somaMenos21 = somaMenos +1
			}
			else if(i > 50){
				somaMais50 +=1;
			}
		}
		System.out.println("\nTotal de pessoas com menos de 21 anos: " + somaMenos21 + "\nTotal de pessoas maiores de 50 anos é: " + somaMais50);
		}
}