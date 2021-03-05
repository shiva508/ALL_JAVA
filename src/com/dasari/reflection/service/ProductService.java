package com.dasari.reflection.service;

import com.dasari.reflection.annotation.Call;

public class ProductService {

	private int rollNo;

	private ProductService() {

	}

	@Call
	public void addProduct() {
		System.out.println("adding product");
	}

	public void editingProduct() {
		System.out.println("Editing product");
	}

	public void result() {
		System.out.println("RESULT:" + rollNo);
	}
}
