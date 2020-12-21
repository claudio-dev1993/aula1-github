package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.products.ImportedProduct;
import entities.products.Product;
import entities.products.UsedProduct;

public class ProgramProducts {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Product> list = new ArrayList<>();

		System.out.println("Enter the number of products: ");
		
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.println("Product #" + i + " data: ");
			System.out.println("Common, used or imported (c/u/i)?");
			char ch = sc.next().charAt(0);

			if (ch == 'c') {

				System.out.println("Name :");
				sc.nextLine();
				String name = sc.nextLine();

				System.out.println("Price :");
				Double price = sc.nextDouble();

				list.add(new Product(name, price));
			} else if (ch == 'u') {

				System.out.println("Name :");
				sc.nextLine();
				String name = sc.nextLine();

				System.out.println("Price :");
				Double price = sc.nextDouble();

				System.out.println("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(sc.next());

				list.add(new UsedProduct(name, price, manufactureDate));
			} else if (ch == 'i') {

				System.out.println("Name: ");
				sc.nextLine();
				String name = sc.nextLine();

				System.out.println("Price: ");
				Double price = sc.nextDouble();

				System.out.println("Customs Fee: ");
				Double customsFee = sc.nextDouble();

				list.add(new ImportedProduct(name, price, customsFee));
			}

		}

		System.out.println();
		System.out.println("PRICE TAGS: ");
		for (Product item : list) {
			System.out.println(item.priceTag());
		}

		sc.close();

	}

}
