package com.java.basics;

class Encapsulate {
	private String mobileName; 
	private double price; 
	
	protected void setPrice(double price) {
		this.price = price; 
	}
	
	protected void setName(String mobileName) {
		this.mobileName = mobileName;
	}
	
	public double getPrice() {
		return price; 
	}
	
	public String getName() {
		return mobileName;
	}
	
}

public class DataEncapsulation{

	public static void main(String args[]) {
		Encapsulate e = new Encapsulate();		
		e.setPrice(32999.77);e.setName("OnePlus");
		
		System.out.println(e.getPrice() +" : "+ e.getName());
	}
}