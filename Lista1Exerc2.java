//Faça um programa que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias. (Considere que o ano tem 365 dias, um mês tem 30)

package aulajava;

import java.util.Scanner;

public class Lista1Exerc2 {

	public static void main(String[] args) {
	
	int total, dias, meses, anos, resAnos, resMeses;
	int a = 365, m = 30;
	
	Scanner leia = new Scanner (System.in);
	
	System.out.println("Quantos dias de idade você tem?");
	
	total = leia.nextInt();
	
	anos = total / a;
	
	resAnos = total % a;
	
	meses = resAnos / m;

	dias = (total%a)%m;
	
	System.out.println("\n Sua idade é de: " + anos + " anos, " + meses + " meses e " + dias + " dias.");
}
}