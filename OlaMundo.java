package aulajava;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		
		String nome="Daniel Costa";
		int idade=29;
		double altura=1.80, nota1, nota2, nota3, media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nSeu nome é: " +nome);
		System.out.println("\nSua altura é: " +altura);
		System.out.println("\nSua idade é: " +idade);
		System.out.println("\n insira a primeira nota:");
		
		nota1 = leia.nextDouble();
		System.out.println("\n insira a segunda nota:");
		nota2 = leia.nextDouble();
		System.out.println("\n Insira a terceira nota:");
		nota3 = leia.nextDouble();
		
		media = (nota1 + nota2 +nota3) /3; 
		
		System.out.println("\nMédia do aluno " +nome +" é: " + media);
		System.out.printf("\nMédia do aluno %s é: %.2f, sendo as notas 1, 2 e 3, %2f, %2f e %2f, respectivamente", nome,media,nota1,nota2,nota3);
	}

}
