package com.ser;

public class Student {

	int id;
	String Name;
	int age;
	public Student(int id, String name, int age) {
		
		this.id = id;
		Name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return Name;
	}
	public int getAge() {
		return age;
	}

	
}

//servlet config object is for one class
//servlet context object is for one for one web application
