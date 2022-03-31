package com.tem.oop;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;

import com.tngtech.java.junit.dataprovider.DataProvider;

/**
 * *********************************
 * 
 * BaseTest - 
 * extended by all test scripts
 * 
 * @author ash
 * @date 12 May 2020
 * @project JavaForTestAutomation
 **********************************
 */
public class BaseTest {
	
	BankAdvanceAccountCreation bankAccount;
	
	@Before
	public void beforeTest() {
		System.out.println("**Run test: " + name.getMethodName());
		
		if(bankAccount == null) {
			bankAccount = new BankAdvanceAccountCreation();
		}		
	}

	@Rule
	public TestName name = new TestName();
	
	/*
	 * Test Approach basis > requirements, design > manual test cases >
	 * automation scripts (traceability) > defects
	 * 
	 * Test inputs - rating: > A <A (drop down) - Interest Rate (text field)
	 * positive test 0.2 to 4.0 (ECP = 2.0) (happy path) negative test
	 * (valid inputs) <0.2 or >4.0 negative test (invalid inputs) <0 edge
	 * cases empty - empty, special chars, null
	 * 
	 * Test outcomes: Status message: Successful: >A, 0.2 - 4.0 Not
	 * Successful: >A, <0.2 or >4.0 Not Successful: <A Invalid Interest
	 * Rate: <=0, null, empty, special chars
	 */	
	
	/**
	 * DataProvider for test methods (parameterisation)
	 * Regression testing - AdvanceAccount
	 * v2.0
	 * @return object
	 */
	@DataProvider
	public static Object[][] regressionAdvanceAccountTestData() {
		
		/*
		 * Test Approach basis > requirements, design > manual test cases >
		 * automation scripts (traceability) > defects
		 * 
		 * Test inputs - rating: > A <A (drop down) - Interest Rate (text field)
		 * positive test 0.2 to 4.0 (ECP = 2.0) (happy path) negative test
		 * (valid inputs) <0.2 or >4.0 negative test (invalid inputs) <0 edge
		 * cases empty - empty, special chars, null
		 * 
		 * 2.0
		 * Valid input: BusinessAccountType = Current Account
		 * 
		 * Test outcomes: Status message: 
		 * Successful: >A, 0.2 - 4.0, Current Account
		 * Not Successful: >A, <0.2 or >4.0, Current Account
		 * Not Successful: <A Invalid Interest
		 * Rate: <=0, null, empty, special chars
		 * 
		 * Invalid Business Type
		 * 
		 */
		
		return new Object[][] {
				{">A", "2.0", "Current Account", "Successful"},
				{">A", "4.1", "Current Account", "Not Successful"},
				{">A", "0.1", "Current Account", "Not Successful"},
				{"<A", "2.0", "Current Account", "Not Successful"},
				{"<A", "2.0", "Savings Account", "Invalid Business Type"},
				{">A", "-1", "Current Account", "Invalid Rate"},
				{">A", "%", "Current Account", "Invalid Rate"},
				{">A", "", "Current Account", "Invalid Rate"},
				{">A", null, "Current Account", "Invalid Rate"},				
		};		
	}
	
	/**
	 * DataProvider for test methods (parameterisation)
	 * Regression testing
	 * @return object
	 */
	@DataProvider
	public static Object[][] regressionTestData() {
		
		/*
		 * Test inputs - rating: > A <A (drop down) - Interest Rate (text field)
		 * positive test 0.2 to 4.0 (ECP = 2.0) (happy path) negative test
		 * (valid inputs) <0.2 or >4.0 negative test (invalid inputs) <0 edge
		 * cases empty - empty, special chars, null
		 * 
		 * Test outcomes: Status message: Successful: >A, 0.2 - 4.0 Not
		 * Successful: >A, <0.2 or >4.0 Not Successful: <A Invalid Interest
		 * Rate: <=0, null, empty, special chars
		 */	
		
		return new Object[][] {
				{">A", "2.0", "Successful"},
				{">A", "4.1", "Not Successful"},
				{">A", "0.1", "Not Successful"},
				{"<A", "2.0", "Not Successful"},
				{">A", "-1", "Invalid Rate"},
				{">A", "%", "Invalid Rate"},
				{">A", "", "Invalid Rate"},
				{">A", null, "Invalid Rate"},				
		};		
	}
	
	/**
	 * DataProvider for test methods (parameterisation)
	 * Smoke testing
	 * @return object
	 */
	@DataProvider
	public static Object[][] smokeTestdata() {		
		return new Object[][] {
				{">A", "2.0", "Successful"}				
		};		
	}
	
	@After
	public void afterTest() {
		System.out.println("** test run completed: " + name.getMethodName());
		System.out.println();
	}
	
	
}
