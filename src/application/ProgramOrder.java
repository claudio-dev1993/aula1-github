package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.enums.OrderStatus;
import entities.order.Client;
import entities.order.Order;
import entities.order.OrderItem;
import entities.order.Product;

public class ProgramOrder {

	

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter client data: ");
		System.out.println("Name: ");
		String name = sc.next(); //corrigido
		System.out.println("Email: ");
		sc.nextLine();
		String email = sc.nextLine();
		System.out.println("Birth date: (DD/MM/YYYY) :");
		Date  date = sdf.parse(sc.nextLine());
		
		Client cl = new Client(name,email, date);
		
		System.out.println("Enter order data: ");
		System.out.println("Status: ");
		OrderStatus os = OrderStatus.valueOf(sc.next()); //corrigido
		
		Order order = new Order(cl, new Date(), os); // corrigido (adicionado)
		
		System.out.println("How many items to this order? ");
		int n = sc.nextInt();
		
		for (int i=1; i <= n; i++) { // corrigido
			System.out.println("Enter # "+i+ " item data");
			System.out.println("Product name: ");
			sc.nextLine(); // corrigido (adicionado)
			String pname = sc.nextLine();
			System.out.println("Product price: ");
			double price = sc.nextDouble();
			System.out.println("Product quantity :");
			int qty = sc.nextInt();
			
			Product prod = new Product(pname,price);
			
			OrderItem item = new OrderItem(qty,price,prod);
			
			order.addItem(item); // corrigido (adicionado)
		}
		
		System.out.println();
		System.out.println("ORDER SUMARY: ");
		System.out.println(order); // corrigido
		
		sc.close();
	}

}
