package com.tem.oop.solid;

public class Rectangle {
	private int length;
	private int breadth;
	
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public int getBreadth() {
		return breadth;
	}
	
	
	public int getLength() {
		return length;
	}
	
	public int getArea() {
		return getBreadth() * getLength();
		
	}
	
}
