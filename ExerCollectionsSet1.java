package ExercCollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ExerCollectionsSet1 {
	
public static void main(String args[]) {
		
		Scanner leia = new Scanner (System.in);
		
		Set <Integer> setInteiros = new HashSet <Integer> ();
		Iterator<Integer> iSetInteiros = setInteiros.iterator();
		
		int i, inteiro;
		
		for (i = 1; i < 11; i++) {
			System.out.println("Por favor, insira o " + i + "º número (números repetidos não serão mostrados)");
			inteiro = leia.nextInt();
			setInteiros.add(inteiro);
		}
		
		System.out.println("Set: " + setInteiros);
	
		}
	

}
