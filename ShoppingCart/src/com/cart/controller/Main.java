package com.cart.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.cart.repository.CategoriesRepo;
import com.cart.ui.CartUI;

public class Main {
	public static void main(String args[]) {
		System.out.println(".....Welcome to shopping Cart.....");
		System.out.println("Showing Product By Categories");
		CategoriesRepo cat = new CategoriesRepo();

		CartUI  cart = new CartUI();
		cat.addProduct();
		
		try(Scanner sc = new Scanner(System.in)){
		
		while(true){
			int choice;
			System.out.println("Select 1 for Product Category \n Select 2 for Cart \n Select 3 for Exit.");
			System.out.println("Select Your choice :");
			choice = sc.nextInt();
			switch(choice){
				case 1:
					cat.showCat();
					System.out.println("Enter Category Id :");
					String catId = sc.next();
					cat.showSubCat(catId);
					System.out.println("Enter SubCategoy Id : ");
					String subCatId = sc.next();
					cat.showProduct(subCatId);
					System.out.println("Enter Product Id to add to cart : ");
					String productId = sc.next();
					cart.cart(productId, 1);
					break;
					
				case 2:
					cart.showCart();
					break;
				
				case 3:
					System.exit(0);
					break;
			    
				default:
					System.out.println("Please Enter Write Input : ");
			}
		}
	  }catch(InputMismatchException e) {
		  System.err.print("Wrong Input.");
	  }
		
	}
}
