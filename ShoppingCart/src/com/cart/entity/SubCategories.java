package com.cart.entity;

public class SubCategories {
	private String subCategoriesId;
	private String subCategoriesName;
	private String catId;
	
	
	public SubCategories() {
		super();
	}
	
	
	public SubCategories(String subCategoriesId, String subCategoriesName, String catId) {
		super();
		this.subCategoriesId = subCategoriesId;
		this.subCategoriesName = subCategoriesName;
		this.catId = catId;
	}


	public String getSubCategoriesId() {
		return subCategoriesId;
	}
	public void setSubCategoriesId(String subCategoriesId) {
		this.subCategoriesId = subCategoriesId;
	}
	public String getSubCategoriesName() {
		return subCategoriesName;
	}
	public void setSubCategoriesName(String subCategoriesName) {
		this.subCategoriesName = subCategoriesName;
	}
	public String getcatId() {
		return catId;
	}
	public void catId(String catId) {
		this.catId = catId;
	}
	@Override
	public String toString() {
		return "SubCategories [subCategoriesId=" + subCategoriesId + ", subCategoriesName=" + subCategoriesName
				+ ", CategoryId" + catId + "]";
	}
	
	
}
