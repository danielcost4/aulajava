package aulajava;

import java.util.Scanner;

public class VariaveisOperadores1 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		float salario, abono, novosalario, nota1, nota2, nota3, nota4, media;
		
		System.out.println("\n insira o salário:");
		
		salario = ler.nextFloat();

		System.out.println("\n insira o abono:");

		abono = ler.nextFloat();

		novosalario = salario + abono;

		System.out.println("\n seu salário novo é: " + novosalario);

		System.out.println("\n insira a primeira nota:");
		
		nota1 = ler.nextFloat();
		
		System.out.println("\n insira a segunda nota");
		
		nota2 = ler.nextFloat();
		
		System.out.println("\n insira a terceira nota:");
		
		nota3 = ler.nextFloat();
		
		System.out.println("\n insira a quarta nota");
		
		nota4 = ler.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.println("\n Sua média é: " + media);
	
		ler.close();
		
	}

}