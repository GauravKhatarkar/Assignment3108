package com.cart.entity;


public class Categories {
	private String categoriesId;
	private String categoriesName;
	
	public Categories() {
		super();
	}
	
	public Categories(String categoriesId, String categoriesName) {
		super();
		this.categoriesId = categoriesId;
		this.categoriesName = categoriesName;
	}


	public String getCategoriesId() {
		return categoriesId;
	}
	public void setCategoriesId(String categoriesId) {
		this.categoriesId = categoriesId;
	}
	public String getCategoriesName() {
		return categoriesName;
	}
	public void setCategoriesName(String categoriesName) {
		this.categoriesName = categoriesName;
	}
	
	
	
	@Override
	public String toString() {
		return "Categories [categoriesId=" + categoriesId + ", categoriesName=" + categoriesName+"]";
	}
	
	
}
