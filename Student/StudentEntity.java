package com.yash.Student;


public class StudentEntity {
	private String studentRollNo;
	private String studentFirstName;
	private String studentLastName;
	private int studentAge;
	private Semester[]  semester = new Semester[3];
	private double studentPercentage;
	
	
	
	public StudentEntity() {
		super();
	}
	public double getStudentPercentage() {
		return studentPercentage;
	}
	public void setStudentPercentage(double studentPercentage) {
		this.studentPercentage = studentPercentage;
	}
	public String getStudentRollNo() {
		return studentRollNo;
	}
	public void setStudentRollNo(String studentRollNo) {
		this.studentRollNo = studentRollNo;
	}
	public String getStudentFirstName() {
		return studentFirstName;
	}
	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}
	public String getStudentLastName() {
		return studentLastName;
	}
	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	
	
	
	public Semester[] getSemester() {
		return semester;
	}
	public void setSemester(Semester[] semester) {
		this.semester = semester;
	}
	@Override
	public String toString() {
		return "StudentEntity [studentRollNo=" + studentRollNo + ", studentFirstName=" + studentFirstName
				+ ", studentLastName=" + studentLastName + ", studentAge=" + studentAge + ", semesterMarks="
				+ semester + "]";
	}
	
	
}
