//Faça um programa que leia as 3 notas de um aluno e calcule a média final deste aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente. 

package aulajava;

import java.util.Scanner;

public class Lista1Exerc5 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		float nota1, nota2, nota3, soma, ponderada;
		
		System.out.println("Insira a primeira nota:");
		
		nota1 = leia.nextFloat();
		
		System.out.println("Insira a segunda nota:");
		
		nota2 = leia.nextFloat();
		
		System.out.println("Insira a terceira nota:");
		
		nota3 = leia.nextFloat();
		
		soma = (nota1 * 2) + (nota2 * 3) + (nota3 * 5);
		
		ponderada = soma / 10;
				
		System.out.println("Média ponderada: " + ponderada);
	}

}
