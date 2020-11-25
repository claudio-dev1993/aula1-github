package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<String> list = new ArrayList<>();
		
			System.out.println("Insira um nome na lista (até 5 nomes): ");
			for(int i=0; i < 5; i++) {	
					list.add(sc.nextLine());	
				}
			
			System.out.println("Nomes inclusos :");
			for(String x : list) {
				System.out.print("["+x+"]");
			}
			
			System.out.println();
			
			List<String> resto = list.stream().filter(x -> x.charAt(0) != 'c').collect(Collectors.toList());
			System.out.println("Nomes que não contém a letra 'c' :");
			for(String x : resto) {
				System.out.print("["+x+"]");
			}
		
		
		sc.close();
	}
}
