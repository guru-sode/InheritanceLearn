package com.uttara.practice;

public class Crocodile extends MariCroc implements Earth  {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void create() {
		System.out.println("Earth create overriden in croc");
		System.out.println(super.i);
	}
	
	public void sleep()
	{
		System.out.println("Croc sleep");
	}
	
	public void swim()
	{
		System.out.println("Croc swimming");
	}

	public Crocodile() {
		super();
		System.out.println("Croc constructor");
	}
	
	
}
