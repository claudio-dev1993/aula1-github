package testes;

import java.util.Random;
import java.util.Scanner;

public class SelectionSort {
	
	public static void selectSort(int[] v) {
		
		int  min, aux;
		
		for (int i =0; i <v.length;i++) {
			min = i;
			for (int j= i+1; j <v.length;j++) {
				if (v[j] < v[min]) {
					min = j;
				}
			}
			if (i != min) {
				aux = v[i];
				v[i]= v[min];
				v[min] = aux;
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
		
		selectSort(vect);
		
		System.out.println();
		System.out.println("Vetor ordenado: ");
		
		for(int i=0; i < vect.length; i++) {
			System.out.print(vect[i]+ ", ");
		}
		
		
		
		sc.close();
		

	}

}
