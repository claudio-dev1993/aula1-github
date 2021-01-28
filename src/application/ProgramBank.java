package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.WithdrawException;

public class ProgramBank {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter account data");
			System.out.println("Number:");
			Integer number = sc.nextInt();
			System.out.println("Holder:");
			String holder = sc.nextLine();
			sc.nextLine();
			System.out.println("Initial balance: ");
			Double balance = sc.nextDouble();
			System.out.println("Withdraw limit:");
			Double withdrawLimit = sc.nextDouble();
			
			Account acc = new Account(number, holder, balance, withdrawLimit);
			
			System.out.println("Enter amount for withdraw:");
			acc.withdraw(sc.nextDouble());
			
			System.out.println(acc);
			
			}
		catch (WithdrawException we) {
			System.out.println(we.getMessage());
		}
		catch (InputMismatchException e) {
			System.out.println("Invalid data format!");
		}
		catch (RuntimeException re) {
			System.out.println("Unexpected Error!");
		}
		finally {
			sc.close();
		}
	}

}
