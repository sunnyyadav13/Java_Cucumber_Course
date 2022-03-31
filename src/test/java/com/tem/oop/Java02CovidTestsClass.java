package com.tem.oop;

/**
 * *********************************
 * @author ash
 * @date 11 May 2020
 * @project JavaForTestAutomation
 **********************************
 */
public class Java02CovidTestsClass extends Java01CovidRecoveredCasesClass {
	
	/*
	 * Inheritance
	 * 
	 * Child class - parent class
	 * subclass - superclass
	 * 
	 *  
	 */
	
	private static int tests;
	private String iso;
	
	public Java02CovidTestsClass() {
		
	}
	
	public Java02CovidTestsClass(String country) {
		super(country);
	}
	
	public static void setTests(int tests) {
		Java02CovidTestsClass.tests = tests;
	}
	
	public static int getTests() {
		return tests;
	}
	
	public void setIso(String iso) {
		this.iso = iso;
	}
	
	public String getIso() {
		return iso;
	}
	
	// Polymorphism
	
	public void printTests() {
		System.out.println("Tests: " + getTests());
	}
	
	// Overriding
	@Override
	public void printCountry() {
		System.out.println("country: " + getCountry());
		System.out.println("ISO: " + getIso());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
