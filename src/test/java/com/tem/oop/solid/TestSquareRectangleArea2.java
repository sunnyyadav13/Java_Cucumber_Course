package com.tem.oop.solid;

import org.junit.Assert;
import org.junit.Test;

public class TestSquareRectangleArea2 {
	/*
	 * Compute Rectangle Area
	 * Using Rectangle Type
	 * Works OK
	 */
	@Test
	public void testRectangleAreaUsingRectangleType() {
		Rectangle rect = new Rectangle();
		
		rect.setBreadth(10);
		rect.setLength(20);
		
		Assert.assertEquals(200, rect.getArea());		
	}
	
	/*
	 * Compute Square Area
	 * Using Rectangle Type
	 * Square object
	 * Works OK
	 */
	@Test
	public void testSquareArea() {
		Rectangle square = new Square();
		
		square.setBreadth(10);
		square.setLength(10);
		
		Assert.assertEquals(100, square.getArea());		
	}
	
	/*
	 * Compute Rectangle Area
	 * Using Rectangle Type
	 * Square object
	 * VIOLATES LSP PRINCIPLE
	 * Fails - AssertionError: expected:<200> but was:<400>
	 */
	@Test
	public void testRectangleAreaUsingRectangleTypeSquareSubType() {
		Rectangle rect2 = new Square();
		
		rect2.setBreadth(10);
		rect2.setLength(20);
		
		Assert.assertEquals(200, rect2.getArea());		
	}
}
