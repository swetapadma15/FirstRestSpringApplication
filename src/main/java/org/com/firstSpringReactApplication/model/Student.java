package org.com.firstSpringReactApplication.model;

public class Student {
	
	private String name;
	private int roll;
	private int age;
	private String branch;
	private int batch;
		
	public Student() {
		super();
	}
	public Student(String name, int roll, int age, String branch, int batch) {
		super();
		this.name = name;
		this.roll = roll;
		this.age = age;
		this.branch = branch;
		this.batch = batch;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getBatch() {
		return batch;
	}
	public void setBatch(int batch) {
		this.batch = batch;
	}
	

}
