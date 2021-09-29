package com.yash.Student;

import java.util.Scanner;

public class StudentUI {

	public static void main(String args[]) {
		
		System.out.println("***************Welcome to Student Portal**************");
	
		StudentRepository.StudentInput();
		while(true) {
			System.out.println("\n\n1.Show Student List by name.\n2Show Student Name by ascending order\n3.Show Student Name in descending order by percentage.\n4.Exit");
			int choice = 1;
			System.out.println("Enter Your choice :");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			
			 
			switch(choice){
				case 1:
					
					
					StudentRepository.showStudentList();
					break;
				case 2:
					StudentRepository.sortStudentByName();
					break;
				case 3:
					StudentRepository.sortStudentByPercentage();
				    break;
				case 4:
					sc.close();
					System.exit(0);
				default:
					System.out.println("Please Enter Right Input");
			}
		}
	}
	
}
