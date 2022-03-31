package com.tem.oop;

/**
 * *********************************
 * @author ash
 * @date 11 May 2020
 * @project JavaForTestAutomation
 **********************************
 */
public class Java01CovidRecoveredCasesClass {
	
	// Non-static variables - Instance variable
	// Not shared among instances
	// Different memory location
	private String country;
	
	// Static - Class variable
	// Shared among instances
	// Common memory location
	private static int recovered;
	
	
	// Encapsulation
	// "data hiding" - binding variables & methods
	
	// Constructors
	// initialising
	// No arg Constructor
	public Java01CovidRecoveredCasesClass() {
		country = null;
	}
	
	// Constructor that takes params
	public Java01CovidRecoveredCasesClass(String country) {
		this.country = country; // this field var = arg
	}
	
	// Setters & Getters
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getCountry() {
		return country;
	}
	
	public static void setRecovered(int recovered) {
		Java01CovidRecoveredCasesClass.recovered = recovered;
	}
	
	public static int getRecovered() {
		return recovered++;
	}
	
	// Use setters and getters
	public void printRecovered() {
		System.out.println("recovered: " + getRecovered());
	}
	
	public void printCountry() {
		System.out.println("country: " + getCountry());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
