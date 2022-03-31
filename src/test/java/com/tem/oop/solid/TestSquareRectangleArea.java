package com.tem.oop.solid;

import org.junit.Assert;

public class TestSquareRectangleArea {

	@org.junit.Test
	public void testRectangleArea() {
		Rectangle rect = new Rectangle();
		
		rect.setBreadth(10);
		rect.setLength(20);
		
		Assert.assertEquals(200, rect.getArea());
		
	}
	
	@org.junit.Test
	public void testSquareArea() {
		Rectangle square = new Square();
		
		square.setBreadth(10);
		square.setLength(20);
		
		Assert.assertEquals(100, square.getArea());
		
	}
}
