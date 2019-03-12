package com.aartek.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.aartek.model.Product;
import com.aartek.model.ProductImage;

@Service
public class ProductService {

	
	public Product getProduct(Product product)
	{
		
		System.out.println("Inside Product Service getProduct() Method");
		
		System.out.println("Product Id :---  "+product.getProductId());
		
		System.out.println("Product Name :---  "+product.getProductName());
		
		System.out.println("Product Description :---  "+product.getDescription());
		
		System.out.println("Product Price :---  "+product.getPrice());
		
		List rows=product.getPimage();
		
		Iterator<ProductImage> itr=rows.iterator();
		 
		while(itr.hasNext())
		 {
			 
			ProductImage proImage=(ProductImage)itr.next();
			
			System.out.println("\n Product Image");
			
			System.out.println(proImage.getImageId()+"\t"+proImage.getImageName()+"\t"+proImage.getImage());
		 }
		
		return product;
	}
	
}
