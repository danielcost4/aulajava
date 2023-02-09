// Faça um programa que leia o tempo de duração de um evento em uma fábrica expressa em segundos e mostre-o expresso em horas, minutos e segundos. 

package aulajava;

import java.util.Scanner;

public class Lista1Exerc3 {
		
		public static void main1(String[] args) {
			
			int total, horas, minutos, segundos;
			
			Scanner leia = new Scanner (System.in);
			
			System.out.println("Quantos segundos estão sendo mostrados no relógio?");
			
			total = leia.nextInt();
			
			horas = total / 60;
			
			minutos = (total%60) / 60;
			
			segundos = (total%60) % 3600;
			
			System.out.println("\n O evento durou " + horas + " horas, " + minutos + " minutos e" + segundos + " segundos");
		
}
}