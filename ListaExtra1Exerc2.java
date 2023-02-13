// Ler 10 números e imprimir quantos são pares e quantos são ímpares. 

package aulajava;

import java.util.Scanner;

public class ListaExtra1Exerc2 {
	
	public static void main(String[] args) {
		
		Scanner leia  = new Scanner(System.in);
		
		int x, numero, pares = 0, impares = 0;
		
		for (x = 1; x<=10; x++) {
			System.out.println("\n Por favor, insira o " + x + "º número");
			numero = leia.nextInt();
			if (numero %2 == 0) {
			pares++;
			}
			else if (numero %2 != 0) {
			impares++;
			}
		}
		System.out.println("Há " + pares + " números pares e " + impares + " números impares");

}
}