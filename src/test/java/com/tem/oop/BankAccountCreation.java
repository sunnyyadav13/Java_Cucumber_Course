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
 *  Bank Account Creation v1.0
 * 
 * @author ash
 * @date 9 May 2020
 * @project JavaForTestAutomation
 * 
 **********************************
 */

public class BankAccountCreation {
	// Inputs - Driven by DataProvider
	//private String rating;
	//private String interestRate;

	// Outcomes
	final String statusSuccessful = "Successful";
	final String statusNotSuccessful = "Not Successful";
	final String statusInvalidRate = "Invalid Rate";

	// Output message
	private String bankAccountCreationStatus;
	//String expectedResult;
	
	/*
	 * Constructor
	 */
	public BankAccountCreation() {
		bankAccountCreationStatus = null;
	}
	
	/**
	 * Setters & Getters
	 */
	
	public void setBankAccountCreationStatus(String bankAccountCreationStatus) {
		this.bankAccountCreationStatus = bankAccountCreationStatus;
	}
	
	public String getBankAccountCreationStatus() {
		return bankAccountCreationStatus;
	}

	/**
	 * This method calculates account creation status based on params input
	 * And is called by test methods
	 * 
	 * @param rating
	 * @param interestRate
	 * @return bankAccountCreationStatus
	 */
	public String getBankAccountStatus(String rating, String interestRate) {
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

			// Not Successful: <A
			if (rating.equalsIgnoreCase("<A")) {
				setBankAccountCreationStatus(statusNotSuccessful);
				break bankAccountStatus;
			}

			if (rating.equalsIgnoreCase(">A")) {
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
