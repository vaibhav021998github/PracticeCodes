package com.test.day6;

public class Student {
private int rollNo;
private String name;
private double percentage;
@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", name=" + name + ", percentage=" + percentage + "]";
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(int rollNo, String name, double percentage) {
	super();
	this.rollNo = rollNo;
	this.name = name;
	this.percentage = percentage;
}
public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPercentage() {
	return percentage;
}
public void setPercentage(double percentage) {
	this.percentage = percentage;
}
}
