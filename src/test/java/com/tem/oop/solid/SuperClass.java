package com.tem.oop.solid;

public class SuperClass {
	/*
	 * class A
	 * class B extends A
	 * 
	 * B obj = new B();
	 * 
	 * 
	 * A obj = new B();
	 * (superclass obj = new subclass)
	 * 
	 * WebDriver driver = new ChromeDriver();
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	public void methodA() {
		System.out.println("Method A");
	}
	
	public void methodB(SuperClass sup) {
		sup.methodA();
		System.out.println("Super method wirh super class object as param.." + sup);
	}
}
