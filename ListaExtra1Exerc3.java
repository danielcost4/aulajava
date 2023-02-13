// Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99

package aulajava;

import java.util.Scanner;

public class ListaExtra1Exerc3 {
	
	public static void main(String[] args) {
		
		int idade = 0, menores = 0, maiores = 0;
		
		Scanner leia = new Scanner (System.in);
		
		while (idade != -99) {
			System.out.println("Por favor, insira sua idade");
			idade = leia.nextInt();
			if (idade < 21 && idade > 0){
				menores++;
			}
			else if (idade > 50) {
				maiores++;
			}
		}
		System.out.println("Há " + menores + " pessoas com menos de 21 anos e " + maiores + " pessoas maiores de 50 anos");
}
}