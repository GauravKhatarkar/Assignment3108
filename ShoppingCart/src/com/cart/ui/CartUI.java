package com.cart.ui;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.cart.entity.Product;
import com.cart.repository.CategoriesRepo;

public class CartUI {
	Map<String,Integer> map = new HashMap<>();
	
	//add product to cart
	public void cart(String pid,int value) {
		if(map.containsKey(pid)) {
			value++;
		}
		
		map.put(pid, value);
	}
	
	//showing details to cart
	public void showCart() {
		Set<Entry<String, Integer>> set=map.entrySet();  
	    Iterator<Entry<String, Integer>> itr=set.iterator();
	    
	    int i=0;
	    int totalPrice = 0;
	    CategoriesRepo cat = new CategoriesRepo();
	    while(itr.hasNext()){  
	        Map.Entry<String,Integer> entry=(Entry<String, Integer>)itr.next();  
	        i++;
	        String pid = (String) entry.getKey();
	        Product p = (Product)cat.showProductById(pid);
	        if(p != null) {
	        
	        System.out.println(i+".| "+String.format("%-20s",p.getProductName())+String.format("|%-10s|",p.getProductPrice())+(int)entry.getValue());
	        totalPrice = totalPrice + p.getProductPrice();
	        }
	        
	    }
	    System.out.println("Total Price : "+totalPrice);
	}
}
