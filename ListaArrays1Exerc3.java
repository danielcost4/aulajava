package exerciciosarrays;

import java.util.Scanner;

public class ListaArrays1Exerc3 {
	public static void main(String[] args) {
		
		int[][] valor = new int[3][3];
		int linha, coluna, somaPrincipal = 0, somaSecundaria = 0;
		String elementosPrincipal ="", elementosSecundaria ="";

		Scanner leia = new Scanner(System.in);
		
		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				System.out.println("\nInsira um valor:");
				valor[linha][coluna] = leia.nextInt();
				if (linha == coluna) {
					somaPrincipal += valor[linha][coluna];
					elementosPrincipal += valor[linha][coluna] + " ";
				}
				if (linha + coluna == 2){
						somaSecundaria += valor[linha][coluna];
						elementosSecundaria += valor[linha][coluna] + " ";
				}
		}
	}
		System.out.println("Elementos da Diagonal Principal: " + elementosPrincipal);
		System.out.println("Elementos da Diagonal Secundária: " + elementosSecundaria);
		System.out.println("Soma dos Elementos da Diagonal Principal: " + somaPrincipal);
		System.out.println("Soma dos Elementos da Diagonal Secundária: " + somaSecundaria);	
	}
}