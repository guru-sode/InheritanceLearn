package com.uttara.practice;

public class Animal implements Earth {
	private String name;
	
	//Interface method
	public void create() {
		System.out.println("Overriden earth method");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void eat()
	{
		System.out.println("Animal eat");
	}
	
	public void sleep()
	{
		System.out.println("Animal sleep");
	}

	public Animal() {
		super();
		System.out.println("Animal constuctor");
	}
	
	
}
