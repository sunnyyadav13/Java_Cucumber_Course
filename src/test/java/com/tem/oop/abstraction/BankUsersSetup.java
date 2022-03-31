package com.tem.oop.abstraction;

/**
 * *********************************
 * 
 * 	abstract class - partial abstraction
 *  CANNOT INSTANTIATE abstract class
 * 
 * @author ash
 * @date 15 May 2020
 * @project JavaForTestAutomation
 **********************************
 */
public abstract class BankUsersSetup {
	private String name;
	private int staffId;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	
	public int getStaffId() {
		return staffId;
	}
	
	public BankUsersSetup(String name, int staffId) {
		this.name = name;
		this.staffId = staffId;
	}
	
	// Abstract method
	// method signature

	public abstract void getRoles();
	
	// Concrete method
	public void printUserInfo() {
		System.out.println("user name: " + getName());
		System.out.println("staff id: " + getStaffId());
	}
}
