package com.tem.workbench;

import org.junit.Test;

/**
 * *********************************
 * @author ash
 * @date 9 May 2020
 * @project JavaForTestAutomation
 **********************************
 */
public class ObjectMethod {
	/**
	 * 
	 */
	@Test
	public void test() {
		String[] str = {"tester1", "tester2", "tester3"};
		System.out.println(str.length);
		System.out.println(str[0]);
		System.out.println();
		
		Object[] obj = {"tester1", "tester2", "tester3"};
		System.out.println(obj.length);
		System.out.println(obj[0]);
		System.out.println();
		
		Object[][] objMulti = {
				{">A", "2.0", "Successful"},
				{">A", "0.10", "Not Successful"},
				{">A", "0.10", "Not Successful"},
		};
		
		System.out.println(objMulti[0][0]);
		System.out.println(objMulti[0][1]);
		System.out.println(objMulti[0][2]);
	}
}
