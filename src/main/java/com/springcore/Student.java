package com.springcore;

public class Student {
	
	private int StudentId;
	private String StudentName;
	private String StudentAdress;
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getStudentAdress() {
		return StudentAdress;
	}
	public void setStudentAdress(String studentAdress) {
		StudentAdress = studentAdress;
	}
	public Student(int studentId, String studentName, String studentAdress) {
		super();
		StudentId = studentId;
		StudentName = studentName;
		StudentAdress = studentAdress;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", StudentName=" + StudentName + ", StudentAdress=" + StudentAdress
				+ "]";
	}
	

}
