/* Leia quatro valores int (n1, n2, n3, n4). 
A seguir, calcule e mostre a diferença do produto entre o n1 e n2 pelo produto entre o n3 e o n4
*/

package aulajava;

import java.util.Scanner;

public class VariaveisOperadores4 {

	public static void main(String[] args) {
		
		float n1, n2, n3, n4, diferenca;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\n Insira o primeiro número:");
		
		n1 = leia.nextFloat();
		
		System.out.println("\n Insira o segundo número:");
		
		n2 = leia.nextFloat();
		
		System.out.println("\n Insira o terceiro número:");
		
		n3 = leia.nextFloat();
		
		System.out.println("\n Insira o quarto número:");
		
		n4 = leia.nextFloat();
		
		diferenca = (n1*n2) - (n3*n4);
		
		System.out.println("\n A diferença entre o produto de n1 e n2 e o produto de n3 e n4 é:" + diferenca);
	}
}
