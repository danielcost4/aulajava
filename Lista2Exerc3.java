// Para doar sangue é necessário ter entre 18 e 69 anos de idade. Pessoas com idade entre 60 e 69 anos, só podem doar se não for a sua primeira doação.
// Escreva um Algoritmo em Java que obtenha via teclado o nome do doador (String), a idade (inteiro) do doador e se já fez outras doações (boolean). 
// De acordo com as Regras para a doação, mostre na tela se o doador está Apto ou Não Apto para doar sangue.

package aulajava;

import java.util.Scanner;

public class Lista2Exerc3 {

	public static void main(String[] args) {
	
	String nomeDoador; 
	int idadeDoador;
	boolean primeiraDoacao;
		
	Scanner leia = new Scanner (System.in);
		
		System.out.println("\nDigite a idade do doador: ");
		idadeDoador = leia.nextInt();
				
		System.out.println("\nInsira o nome do doador: ");
		nomeDoador = leia.next();
		
		System.out.println("\nPrimeira vez que doa sangue? Responda com 'true' or 'false'");
		primeiraDoacao = leia.nextBoolean();
		
		if (idadeDoador >= 18 && idadeDoador <= 69) {
			if (idadeDoador > 60 && primeiraDoacao == false) {	
			System.out.println("\n" + nomeDoador + " está apto a doar sangue");
			}
			else if (idadeDoador > 60 && primeiraDoacao == true){ 
			System.out.println("\n" + nomeDoador + " não está apto a doar sangue");
			}
			else
			System.out.println("\n" + nomeDoador + " está apto a doar sangue");
		}
		else if (idadeDoador > 69) {
			System.out.println("\n" + nomeDoador + " não está apto a doar sangue");
		}		
	}

}