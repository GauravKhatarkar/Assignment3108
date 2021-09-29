package com.yash.Student;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ListIterator;

public class StudentRepository {
	
	static ArrayList<StudentEntity> student = new ArrayList<StudentEntity>();
	
    public static void StudentInput() {
	
		StudentEntity student1=new StudentEntity();
		student1.setStudentRollNo("001");
		student1.setStudentFirstName("Yuvraj");
		student1.setStudentLastName("Singh");
		student1.setStudentAge(17);
		Semester s1Sem1 = new Semester(1,new int[]{50,67,34,76,87});
		Semester s1Sem2 = new Semester(2,new int[]{54,65,76,76,45});
		Semester s1Sem3 = new Semester(3,new int[]{76,43,88,87,65});
		student1.setSemester(new Semester[] {s1Sem1,s1Sem2,s1Sem3});
		student1.setStudentPercentage((s1Sem1.getPercent()+s1Sem2.getPercent()+s1Sem3.getPercent())/3);
		student.add(student1);
		
		StudentEntity student2=new StudentEntity();
		student2.setStudentRollNo("002");
		student2.setStudentFirstName("Virat");
		student2.setStudentLastName("Kohali");
		student2.setStudentAge(15);
		Semester s2Sem1 = new Semester(1,new int[]{54,65,76,88,45});
		Semester s2Sem2 = new Semester(2,new int[]{49,89,76,76,45});
		Semester s2Sem3 = new Semester(3,new int[]{76,43,87,57,65});
		student2.setSemester(new Semester[] {s2Sem1,s2Sem2,s2Sem3});
		student2.setStudentPercentage((s2Sem1.getPercent()+s2Sem2.getPercent()+s2Sem3.getPercent())/3);
		
		student.add(student2);
		
		StudentEntity student3=new StudentEntity();
		student3.setStudentRollNo("003");
		student3.setStudentFirstName("Rohit");
		student3.setStudentLastName("Sharma");
		student3.setStudentAge(14);
		Semester s3Sem1 = new Semester(1,new int[]{50,98,34,76,87});
		
		Semester s3Sem2 = new Semester(2,new int[]{54,65,26,66,45});
		Semester s3Sem3 = new Semester(3,new int[]{76,43,80,97,65});
		student3.setSemester(new Semester[] {s3Sem1,s3Sem2,s3Sem3});
		student3.setStudentPercentage((s3Sem1.getPercent()+s3Sem2.getPercent()+s3Sem3.getPercent())/3);
		student.add(student3);
		
		StudentEntity student4=new StudentEntity();
		student4.setStudentRollNo("004");
		student4.setStudentFirstName("Suresh");
		student4.setStudentLastName("Raina");
		student4.setStudentAge(18);
		Semester s4Sem1 = new Semester(1,new int[]{58,77,34,76,87});
		Semester s4Sem2 = new Semester(2,new int[]{54,56,66,66,45});
		Semester s4Sem3 = new Semester(3,new int[]{76,44,88,86,66});
		student4.setSemester(new Semester[] {s4Sem1,s4Sem2,s4Sem3});
		student4.setStudentPercentage((s4Sem1.getPercent()+s4Sem2.getPercent()+s4Sem3.getPercent())/3);
		student.add(student4);
		
		StudentEntity student5=new StudentEntity();
		student5.setStudentRollNo("005");
		student5.setStudentFirstName("Sachin");
		student5.setStudentLastName("Tendular");
		student5.setStudentAge(17);
		Semester s5Sem1 = new Semester(1,new int[]{93,45,37,76,87});
		Semester s5Sem2 = new Semester(2,new int[]{65,87,43,76,45});
		Semester s5Sem3 = new Semester(3,new int[]{78,99,88,87,65});
		student5.setSemester(new Semester[] {s5Sem1,s5Sem2,s5Sem3});
		student5.setStudentPercentage((s1Sem1.getPercent()+s1Sem2.getPercent()+s1Sem3.getPercent())/3);
		student.add(student5);
		
		StudentEntity student6=new StudentEntity();
		student6.setStudentRollNo("006");
		student6.setStudentFirstName("Virendra");
		student6.setStudentLastName("Shawag");
		student6.setStudentAge(17);
		Semester s6Sem1 = new Semester(1,new int[]{39,45,37,76,87});
		Semester s6Sem2 = new Semester(2,new int[]{65,87,45,32,35});
		Semester s6Sem3 = new Semester(3,new int[]{78,94,86,47,65});
		student6.setSemester(new Semester[] {s6Sem1,s6Sem2,s6Sem3});
		student6.setStudentPercentage((s6Sem1.getPercent()+s6Sem2.getPercent()+s6Sem3.getPercent())/3);
		student.add(student6);
	}

	public static void sortStudentByName() {
		
		Collections.sort(student,new Comparator<StudentEntity>() {
			@Override
			public int compare(StudentEntity o1, StudentEntity o2) {
				
				int value = o1.getStudentFirstName().compareTo(o2.getStudentFirstName());
				 if(value != 0) {
					 return value;
				 }
				 return o1.getStudentLastName().compareTo(o2.getStudentLastName());
            }	
		});
	}
	
	public static void sortStudentByPercentage() {
		Collections.sort(student, new Comparator<StudentEntity>(){
			@Override
			public int compare(StudentEntity o1,StudentEntity o2){
				if(o1.getStudentPercentage()<o2.getStudentPercentage()) {
	            	   return 1;
	               }else if(o1.getStudentPercentage()>o2.getStudentPercentage()) {
	            	   return -1;
	               }else {
					return 0;
	               }
			}
		});
	}
	
	public static void showStudentList() {
		System.out.println("RollNo__________Name______________Age_________Percentage\n\n");
		
		
		ListIterator<StudentEntity> itr = student.listIterator();
		
		StudentEntity s = null;
		
		while(itr.hasNext()){
			 s =itr.next();
			 
			System.out.println(" "+s.getStudentRollNo()+"   "+String.format("%-15s",s.getStudentFirstName()+" "+s.getStudentLastName())+"          "+s.getStudentAge()+"        "+s.getStudentPercentage());
		}	
	}
		
	
}
