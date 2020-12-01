package testes;

import java.util.Random;
import java.util.Scanner;

public class BubbleSort {
	
	public static void bubSort(int[] v) {
		
		int aux;
		
		for(int j= v.length-1; j >= 1; j--) { //percorre o vetor, da ultima posição, em ordem decrescente.
			
			for ( int i = 0; i < j; i++) {//percorre o vetor em ordem crescente e faz as trocas.
				
				if(v[i] > v[i+1]) { // compara se elemento na posição "i" é maior que o elemento na posição "i+1", se sim, então:
					aux = v[i];		// aqui começa a troca.
					v[i] = v[i+1];
					v[i+1] = aux;
				}
			}
		}
	}

	public static void main(String[] args) {
		
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		int[] vect = new int[10];
		
		for(int i=0; i <vect.length; i++) {
			
			vect[i] = rd.nextInt(50);
		}
		
		System.out.println("Vetor desordenado: ");
		
		for(int i=0; i < vect.length; i++) {
			System.out.print(vect[i]+ ", ");
		}
		
		bubSort(vect);
		
		System.out.println();
		System.out.println("Vetor ordenado: ");
		
		for(int i=0; i < vect.length; i++) {
			System.out.print(vect[i]+ ", ");
		}
		
		sc.close();
	}

}
