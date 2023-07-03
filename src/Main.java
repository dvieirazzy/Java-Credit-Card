import java.util.Collections;
import java.util.Scanner;

import br.com.alura.creditcard.models.CreditCard;
import br.com.alura.creditcard.models.Product;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Inform the card limit: R$ ");
		double limit = input.nextDouble();
		CreditCard card = new CreditCard(limit);
		
		String menu = """
				
				Select the operation:
				
				0 - Quit
				1 - Purchase
				""";

		int operation = 1;
		String productName;
		double productPrice;
		boolean purchased;
		
		while (operation != 0) {
			System.out.println(menu);
			System.out.print("Operation: ");
			operation = input.nextInt();
			
			if (operation == 1) {
				System.out.print(">>> Product name: ");
				productName = input.next();
				System.out.print(">>> Product price: R$ ");
				productPrice = input.nextDouble();
	
				Product product = new Product(productName, productPrice);
				
				purchased = card.purchase(product);
				if (!purchased) {
					break;
				}
			}
		}
		Collections.sort(card.getProducts());
		
		System.out.println("\n---------------");
		System.out.println("Purchases Made: \n");
		for (Product product : card.getProducts()) {
			System.out.println(product.getName() + " - " + product.getPrice());
		}
		System.out.println("\n---------------");
		System.out.println("\nCard balance: R$ " + card.getBalance());
		input.close();
	}
}
