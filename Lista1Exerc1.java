package aulajava;

import java.util.Scanner;

public class Lista1Exerc1 {

	//Faça um programa que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias.
	
	
	public static void main(String[] args) {
		
		int idadeEmDias, anosDeVida, meses, dias, restoanos, restomeses;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\n Quantos anos você tem?");
		
		anosDeVida = leia.nextInt();
		
		System.out.println("\n Além desses anos, quantos meses?");
		
		meses = leia.nextInt();
		
		System.out.println("\n E quantos dias, além desses anos e meses, você tem?");
		
		dias = leia.nextInt();
		
		idadeEmDias = (anosDeVida*365) + (meses*30) + dias;
	    
		System.out.println("\n Sua idade em dias é: "+ idadeEmDias);
		
	}
	
}
