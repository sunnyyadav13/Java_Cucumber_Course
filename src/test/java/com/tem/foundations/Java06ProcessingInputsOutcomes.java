package com.tem.foundations;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

/**
 * *********************************
 * @author ash
 * @date 9 May 2020
 * @project JavaForTestAutomation
 * 
 * * Application: Business Banking
	* Feature: Create Business Bank Account
	* Valid Inputs for Successful account creation: Rating > A and Interest Rate between 0.2 to 4.0 
	* Expected Outcomes: Successful, Not Successful or Invalid Rate (<0)
 **********************************
 */
public class Java06ProcessingInputsOutcomes {
	/*
	 * operators
	 * 
	 * comparison: ==, >=, <=, !=
	 * Logical: boolean; && (and), ||, !
	 */
	
	// Inputs
	String rating = ">A";
	String interestRate = "2.0";
	
	// Outcomes
	String statusSuccessful = "Successful";
	String statusNotSuccessful = "Not Successful";
	String statusInvalidRate = "Invalid Rate";
	
	@Before
	public void beforeTest() {
		System.out.println("**Run test: " + name.getMethodName());
	}
	
	@After
	public void afterTest() {
		System.out.println("** test run completed: " + name.getMethodName());
		System.out.println();
	}
	
	@Rule
	public TestName name = new TestName();
	
	/**
	 * 
	 */
	@Test
	public void testProcessingInputsOutcomes() {
		/*
		 * Test Approach
		 * basis > requirements, design > manual test cases > automation scripts (traceability) > defects
		 * 
		 * Test inputs - rating: > A <A (drop down)
		 *             - Interest Rate (text field)
		 *               positive test 0.2 to 4.0 (ECP = 2.0) (happy path)
		 *               negative test (valid inputs) <0.2 or >4.0
		 *               negative test (invalid inputs) <0
		 *               edge cases empty - empty, special chars, null
		 *               
		 * Test outcomes: Status message: 
		 *                Successful: >A, 0.2 - 4.0
		 *                Not Successful: >A, <0.2 or >4.0
		 *                Not Successful: <A
		 *                Invalid Interest Rate: <=0, null, empty, special chars
		 */
		
		String bankAccountCreationStatus = null;
		
		bankAccountStatus: {
			// Invalid Interest Rate: null, empty, special chars
			if(interestRate == null 
					|| interestRate.isEmpty()
					|| !interestRate.matches("^[-0-9.]+$")){
				bankAccountCreationStatus = statusInvalidRate;	
				break bankAccountStatus;
			}
			
			// Invalid Interest Rate: <=0
			if(Double.parseDouble(interestRate) <= 0){
				bankAccountCreationStatus = statusInvalidRate;	
				break bankAccountStatus;
			}
			
			// Not Successful: <A
			if(rating.equalsIgnoreCase("<A")) {
				bankAccountCreationStatus = statusNotSuccessful;	
				break bankAccountStatus;
			}
			
/*			// Not Successful: >A, <0.2 or >4.0
			if(rating.equalsIgnoreCase(">A") && (Double.parseDouble(interestRate) < 0.2 || Double.parseDouble(interestRate) > 4.0)) {
				bankAccountCreationStatus = statusNotSuccessful;	
				break bankAccountStatus;
			}
			
			// Successful: >A, 0.2 - 4.0
			if(rating.equalsIgnoreCase(">A") && (Double.parseDouble(interestRate) >= 0.2 && Double.parseDouble(interestRate) <= 4.0)) {
				bankAccountCreationStatus = statusSuccessful;	
				break bankAccountStatus;
			}*/
			
			if(rating.equalsIgnoreCase(">A")) {
				// Not Successful: >A, <0.2 or >4.0
				if((Double.parseDouble(interestRate) < 0.2 || Double.parseDouble(interestRate) > 4.0)) {
					bankAccountCreationStatus = statusNotSuccessful;	
					break bankAccountStatus;
				}
				
				// Successful: >A, 0.2 - 4.0
				if((Double.parseDouble(interestRate) >= 0.2 && Double.parseDouble(interestRate) <= 4.0)) {
					bankAccountCreationStatus = statusSuccessful;	
					break bankAccountStatus;
				}
			}
		}
		
		System.out.println("bankAccountCreationStatus: " + bankAccountCreationStatus);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
