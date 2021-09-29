package com.yash.Student;

import java.util.Arrays;

public class Semester {
	private int semester;
	private int[] marks = new int[5];
	private float percent;
	
	
	
	public Semester(int semester, int[] marks) {
		super();
		this.semester = semester;
		this.marks = marks;
		int total = 0;
		for(int m : marks) {
			total += m;
		}
		percent = total/5;
	}
	public Semester() {
		super();
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public float getPercent() {
		return percent;
	}
	public void setPercent(float percent) {
		this.percent = percent;
	}
	
	
	@Override
	public String toString() {
		return "SemesterMarks [semester=" + semester + ", marks=" + Arrays.toString(marks) + "]";
	}
	
	
	
}
