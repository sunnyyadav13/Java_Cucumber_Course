package com.tem.oop.abstraction;

import org.junit.Test;

public class BankUserSetupTest {

	@Test
	public void testStaffRoles() {
		StaffAdminDepartment staff = new StaffAdminDepartment("Tim", 123123);
		staff.printUserInfo();
	}
}
