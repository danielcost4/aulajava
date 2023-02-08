package aulajava;

import java.util.Scanner;

public class VariaveisOperadores3 {
	
	public static void main(String[] args) {
		
		float bruto, adicional, extras, descontos, liquido;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Insira o Salário Bruto");
		
		bruto = leia.nextFloat();
		
		System.out.println("Insira o Adicional:");
		
		adicional = leia.nextFloat();
		
		System.out.println("Insira quantidade de Horas Extras");
		
		extras = leia.nextFloat();
		
		System.out.println("Insira os descontos");
		
		descontos = leia.nextFloat();
		
		liquido = bruto + adicional + (5*extras) - descontos;
		
		System.out.println("Seu salário líquido é: " + liquido);
}
}