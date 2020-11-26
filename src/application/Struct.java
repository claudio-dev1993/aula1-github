package application;

import java.util.Random;
import java.util.Scanner;

public class Struct {
	
	//Classe como uma  estrutura heterogenea 
	public static class DADOS_ALUNO {
		
		int CodAluno;
		String Nome;
		int Turma;
		
		DADOS_ALUNO () {}

		@Override
		public String toString() {
			return " ALUNO: [Nome=" + Nome + ", CodAluno= "+ CodAluno +  ", Turma=" + Turma + "]";
		}

		
	}
	
	//Função para imprimir os dados da estrutura
	public static void  Imprimir (DADOS_ALUNO Aluno) {
		System.out.println("Código do Aluno: " + Aluno.CodAluno);
		System.out.println("Nome: " + Aluno.Nome);
		System.out.println("Turma: " + Aluno.Turma);
		
	}
	
	public static void InsertionSort(int[] vetor) {
		
		int i,j, aux;
		
		for ( i = 1; i < vetor.length; i++) {
			aux = vetor[i];
			 j = i -1; // recebe o item da posição à esquerda de "i".
			 
			while ((j>=0) && (aux < vetor[j])) {
				vetor[j+1] = vetor[j];
				j--;
			}
			
			vetor[j+1] = aux;
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Random rd = new Random();
		
		int []vect = new int[10];
		
		for(int i=0; i< vect.length; i++) {
			vect[i] = rd.nextInt(100);
		}
		
		System.out.println("Vetor desordenado: ");
		
		for (int i = 0; i <vect.length; i++) {
			System.out.print("["+vect[i]+"]");
		}
		
		System.out.println();
		InsertionSort(vect);
		
		System.out.println("Vetor ordenado: ");
		
		for (int i = 0; i <vect.length; i++) {
			System.out.print("["+vect[i]+"]");
		}
		
		
		
		sc.close();
		
	}
	
	

}
