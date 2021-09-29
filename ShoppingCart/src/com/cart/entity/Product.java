package com.cart.entity;

public class Product {
	private String productId;
	private String productName;
	private String productDetails;
	private int productPrice;
	private int discount;
	private String subCatId;
	
	public Product() {
		super();
	}
	public Product(String productId, String productName, String productDetails, int productPrice, int discount,String subCatId) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDetails = productDetails;
		this.productPrice = productPrice;
		this.discount = discount;
		this.subCatId = subCatId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDetails() {
		return productDetails;
	}
	public void setProductDetails(String productDetails) {
		this.productDetails = productDetails;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public String getSubCatId() {
		return subCatId;
	}
	public void setSubCatId(String subCatId) {
		this.subCatId = subCatId;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productDetails=" + productDetails
				+ ", productPrice=" + productPrice + ", discount=" + discount + ", subCatId=" + subCatId + "]";
	}
	
	
	
	
	
}
