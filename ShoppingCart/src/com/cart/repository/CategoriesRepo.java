package com.cart.repository;

import java.util.LinkedList;
import java.util.List;

import com.cart.entity.Categories;
import com.cart.entity.Product;
import com.cart.entity.SubCategories;

public class CategoriesRepo {
	static List<Categories> catList = new LinkedList<>();
	static List<SubCategories> subCat = new LinkedList<>();
	static List<Product> product = new LinkedList<>();
	
	//Adding Product to List
    public void addProduct() {
    	Product pd1 = new Product("10001","iPhone 13 Pro",
    			"Up to 28 hours of video playback.iPhone 13 Pro Max has the best battery life ever on iPhone.",100000,10,"20001");
    	Product pd2 = new Product("10002","realme Book (Slim)","Real Blue i5 8GB+512GB",59999,56000,"20002");
    	Product pd3 = new Product("10003","realme Book (Slim)","Real Blue i3 8GB+25GB",45999,40000,"20002");
    	Product pd4 = new Product("10004","BOAT Rockerz 255 Pro","High Level functionality is provided to th"
    			+ "e boAt Rockerz 255 Pro by the Advanced Chipset providing the features of the latest Bluetooth 5.0 Version, Frequency Response: 20Hz-20KHz.",1399,1200,"20003");
    	Product pd5 = new Product("10005","T-Shirt","Orange Solid Crew Neck T-Shirt",700,500,"20004");
    	Product pd6 = new Product("10006","T-Shirt","PETER ENGLAND JEANS Blue Printed T-Shirt",900,600,"20004");
    	Product pd7 = new Product("10007","Causal Shirt","BYFORD Light Olive Printed Casual Shirt",1200,900,"20005");
    	Product pd8 = new Product("10008","BARE DENIM","Dark Blue Skinny Fit Full Length Jeans",6000,3000,"20006");
    	Product pd9 = new Product("10009","Bhagwat Gita","Shree krishna",200,190,"20007");
    	
    	product.add(pd1);
    	product.add(pd2);
    	product.add(pd3);
    	product.add(pd4);
    	product.add(pd5);
    	product.add(pd6);
    	product.add(pd7);
    	product.add(pd8);
    	product.add(pd9);
    	
    	SubCategories subcat1 = new SubCategories("20001","Phone","30001"); 
    	SubCategories subcat2 = new SubCategories("20002","Laptop","30001");
    	SubCategories subcat3 = new SubCategories("20003","headphone","30001");
    	SubCategories subcat4 = new SubCategories("20004","T-shirts","30002");
    	SubCategories subcat5 = new SubCategories("20005","Shirts","30002");
    	SubCategories subcat6 = new SubCategories("20006","Jeans","30002");
    	SubCategories subcat7 = new SubCategories("20007","Dev. Books","30003");
    	
    	subCat.add(subcat1);
    	subCat.add(subcat2);
    	subCat.add(subcat3);
    	subCat.add(subcat4);
    	subCat.add(subcat5);
    	subCat.add(subcat6);
    	subCat.add(subcat7);
    	
    	Categories cat1 = new Categories("30001","Electronics");
    	Categories cat2 = new Categories("30002","Clothes");
    	Categories cat3 = new Categories("30003","Books");
    	
    	catList.add(cat1);
    	catList.add(cat2);
    	catList.add(cat3);
    }
    
    //Showing categories on console
    public void showCat() {
    	System.out.println("------- Categories -----");
    	for(Categories cat: catList) {
    		System.out.println(cat.getCategoriesId()+"---------->"+cat.getCategoriesName());
    	}
    }
    
    //showing subcategories to Console
    public boolean showSubCat(String catId) {
    	System.out.println("-------- SubCategories ------");
  
    	for(SubCategories sCat: subCat) {
    		if(sCat.getcatId().equals(catId)) {
    			System.out.println(sCat.getSubCategoriesId()+"------->"+sCat.getSubCategoriesName());
    			return true;
    		}
    	}
    	
    		System.out.println("Your Input was wrong.");

    		return false;
    }
    
    //Showing Product to console
    public boolean showProduct(String subCatId) {
    	System.out.println("-------- Proudct ----------");
    	System.out.println(String.format("%8s|","Prod. Id")+String.format("%20s|","ProductName")+String.format("%8s|","Price")+String.format("%25s","Product Details\n\n"));
		
    	for(Product pd: product) {
    		if(pd.getSubCatId().equals(subCatId)) {
    			System.out.println(String.format("%8s|",pd.getProductId())+String.format("%20s|",pd.getProductName())+String.format("%8s|",pd.getProductPrice())+String.format("%25s",pd.getProductDetails()));
    			return true;
    		}
    	}
    		System.out.println("Your Input was wrong.");
    		return false;
    }
    
    //Showing Product to cart by ProductId
    public Product showProductById(String productId) {
    	for(Product pd: product) {
    		if(pd.getProductId().equals(productId)) {
    			return pd;
    		}
    	}
    	
    	return null;
    }
}
