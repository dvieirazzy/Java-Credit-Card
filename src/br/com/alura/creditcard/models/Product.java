package br.com.alura.creditcard.models;

public class Product implements Comparable<Product>{
	private String name;
	private double price;

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return "Product: " + this.getName() + "price: R$ " + this.getPrice();
	}

	@Override
	public int compareTo(Product anotherProduct) {
		return Double.valueOf(this.price).compareTo(Double.valueOf(anotherProduct.price));
	}
}
