package com.tem.oop;

/**
 * *********************************
 * 
 * This class is employed for creation of BankAccount using the following attributes:
 *  *      * Application: Business Banking Feature: Create Business Bank
 *          Account Valid Inputs for Successful account creation: Rating > A and
 *          Interest Rate between 0.2 to 4.0 Expected Outcomes: Successful, Not
 *          Successful or Invalid Rate (<0)
 *          
 *  Bank Account Creation v2.0
 * 
 * @author ash
 * @date 9 May 2020
 * @project JavaForTestAutomation
 * 
 **********************************
 */

public class BankAdvanceAccountCreation extends BankAccountCreation {
	// Inputs - Driven by DataProvider
	//private String rating;
	//private String interestRate;

	// Outcomes
	//final String statusSuccessful = "Successful";
	//final String statusNotSuccessful = "Not Successful";
	//final String statusInvalidRate = "Invalid Rate";
	
	final String statusBusinessAccountType = "Invalid Business Type";

	// Output message
	// private String bankAccountCreationStatus;
	//String expectedResult;
	
	/*
	 * Constructor
	 */
	public BankAdvanceAccountCreation() {
		super();
	}
	
	/**
	 * Setters & Getters
	 */
	

	/**
	 * Overloading
	 * 
	 * This method calculates account creation status based on params input
	 * And is called by test methods
	 * 
	 * @param rating
	 * @param interestRate
	 * @param businessAccountType
	 * @return bankAccountCreationStatus
	 */
	public String getBankAccountStatus(String rating, String interestRate, String businessAccountType) {
		bankAccountStatus: {
			// Invalid Interest Rate: null, empty, special chars
			if (interestRate == null || interestRate.isEmpty() || !interestRate.matches("^[-0-9.]+$")) {
				// bankAccountCreationStatus = statusInvalidRate;
				setBankAccountCreationStatus(statusInvalidRate);
				break bankAccountStatus;
			}

			// Invalid Interest Rate: <=0
			if (Double.parseDouble(interestRate) <= 0) {
				setBankAccountCreationStatus(statusInvalidRate);
				break bankAccountStatus;
			}
			
			// Invalid business Account Type - SA
			if (!businessAccountType.equalsIgnoreCase("current account")) {
				setBankAccountCreationStatus(statusBusinessAccountType);
				break bankAccountStatus;
			}

			// Not Successful: <A
			if (rating.equalsIgnoreCase("<A")) {
				setBankAccountCreationStatus(statusNotSuccessful);
				break bankAccountStatus;
			}

			if (rating.equalsIgnoreCase(">A") && businessAccountType.equalsIgnoreCase("current account")) {
				// Not Successful: >A, <0.2 or >4.0
				if ((Double.parseDouble(interestRate) < 0.2 || Double.parseDouble(interestRate) > 4.0)) {
					setBankAccountCreationStatus(statusNotSuccessful);
					break bankAccountStatus;
				}

				// Successful: >A, 0.2 - 4.0
				if ((Double.parseDouble(interestRate) >= 0.2 && Double.parseDouble(interestRate) <= 4.0)) {
					setBankAccountCreationStatus(statusSuccessful);
					break bankAccountStatus;
				}
			}
		}
		//return bankAccountCreationStatus;	
	    return getBankAccountCreationStatus();
	}
}
