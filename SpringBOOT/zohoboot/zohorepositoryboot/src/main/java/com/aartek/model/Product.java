package com.aartek.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

public class Product implements Serializable {

	@Column(name="productID")
	private Integer productID;
	private String productName;
	private String description;
	private String noProduct;
	private String price;
	
	@OneToMany(targetEntity=ProductImage.class,cascade=CascadeType.ALL)
	@JoinColumn(name="productID",referencedColumnName="productID")
	private List<ProductImage> productImage;

	public Integer getProductID() {
		return productID;
	}

	public void setProductID(Integer productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNoProduct() {
		return noProduct;
	}

	public void setNoProduct(String noProduct) {
		this.noProduct = noProduct;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public List<ProductImage> getProductImage() {
		return productImage;
	}

	public void setProductImage(List<ProductImage> productImage) {
		this.productImage = productImage;
	}
	
	
	
}
