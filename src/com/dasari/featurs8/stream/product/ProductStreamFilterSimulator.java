package com.dasari.featurs8.stream.product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class ProductStreamFilterSimulator {

	public static List<Product> products = new ArrayList<>();

	public static void main(String[] args) {
		products.add(new Product(1, "HP Laptop", 25000f));
		products.add(new Product(2, "Dell Laptop", 30000f));
		products.add(new Product(3, "Lenevo Laptop", 28000f));
		products.add(new Product(4, "Sony Laptop", 28000f));
		products.add(new Product(5, "Apple Laptop", 90000f));
		withoutStreamApi();
		withStreamApi();
	}

	private static void withStreamApi() {
		Float totalCost=0f;
		totalCost= (float) products.stream().mapToDouble(Product::getPrice).sum();
		OptionalDouble maxPrice=products.stream().mapToDouble(Product::getPrice).max();
		System.out.println("Total:"+totalCost);
		maxPrice.ifPresent(max->System.out.println("Max:"+max));
		
		
	}

	private static void withoutStreamApi() {
		Float totalCost=0f;
		Float max=0f;
		for (Product product : products) {
			float price=product.getPrice();
			totalCost+=price;
			if(max<price) {
				max=price;
			}
		}
		System.out.println("Total:"+totalCost);
		System.out.println("Max:"+max);
	}

}
