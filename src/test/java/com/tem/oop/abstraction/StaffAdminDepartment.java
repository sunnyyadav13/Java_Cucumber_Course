package com.tem.oop.abstraction;

import java.util.ArrayList;
import java.util.List;

public class StaffAdminDepartment extends BankUsersSetup{
	
	@SuppressWarnings("serial")
	// Roles (create bank user, delete bank user)
	
	List<String> staffuserRoles = new ArrayList<String>() {{
		add("create bank user");
		add("delete bank user");
	}};

	public StaffAdminDepartment(String name, int staffId) {
		super(name, staffId);
	}

	@Override
	public void getRoles() {		
		System.out.println("Staff ID: " + super.getStaffId() );;
		
		for(String role:staffuserRoles) {
			System.out.println("staff roles - " + role);
		}
		
	}

	
	
	// Define roles
	
	
}
