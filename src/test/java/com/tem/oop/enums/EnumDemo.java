package com.tem.oop.enums;

import org.junit.Test;

public class EnumDemo {

	@Test
	public void testEnum() {
		TestEnvironmentsEnums env = TestEnvironmentsEnums.TEST_URL;
		System.out.println("TEST env - " + env.getURL());
		
		System.out.println("UAT env - " + TestEnvironmentsEnums.UAT_URL.getURL());
	}
}
