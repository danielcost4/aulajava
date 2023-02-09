package aulajava;

import java.util.Scanner;

//Escreva  um programa que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão D = (R + S)/2, onde R = (A+B)^2 e S = (B+C)^2

public class Lista1Exerc4 {
	
	public static void main(String[] args) {
	
		double A, B, C, D, R, S, X, Y;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\n Por favor, insira o número A:");
		
		A = leia.nextInt();
		
		System.out.println("\n Por favor, insira o número B:");
		
		B = leia.nextInt();
		
		System.out.println("\n Por favor, insira o número C:");
		
		C = leia.nextInt();
		
		X = A+B;
				
		Y = B+C;
		
		R = Math.pow(X, 2);
		
		S = Math.pow(Y, 2);
		
		D = (R + S)/2;
		
		System.out.println("\n D = " + D);
		
}
}