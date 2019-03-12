package com.aartek.service;

import org.springframework.stereotype.Service;

import com.aartek.model.Product;

@Service
public class ProductService {
	public Product getProduct(Product product)
	{
		System.out.println("Inside Product Service ");
		System.out.println("Product Id : "+product.getProductID());
		System.out.println("Product name : "+product.getProductName());
		System.out.println("Product Price : "+product.getNoProduct());
		System.out.println("Product Description : "+product.getDescription());
		System.out.println("Product Number of Product : "+product.getNoProduct());
		return product;
	}

}
