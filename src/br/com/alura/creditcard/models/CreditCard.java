package br.com.alura.creditcard.models;

import java.util.ArrayList;
import java.util.List;

public class CreditCard {
	private double limit;
	private double balance;
	private List<Product> products;
	
	public CreditCard(double limit) {
		this.limit = limit;
		this.balance = limit;
		this.products = new ArrayList<>();
	}	
	
	public double getLimit() {
		return limit;
	}

	public double getBalance() {
		return balance;
	}

	public List<Product> getProducts() {
		return products;
	}

	public boolean purchase(Product product) {
		
		if (this.balance >= product.getPrice()) {
			this.balance -= product.getPrice();
			this.products.add(product);
			System.out.println("\nSuccessful Purchase ✔️");
			return true;
		}
		System.out.println("\nInsuficient Balance ❌");
		return false;
	}
	
}
