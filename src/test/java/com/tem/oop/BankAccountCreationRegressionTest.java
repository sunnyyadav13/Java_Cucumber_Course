package com.tem.oop;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;

@RunWith(DataProviderRunner.class)
public class BankAccountCreationRegressionTest extends BaseTest {	
	
	@Test
	@UseDataProvider("regressionTestData")
	public void testProcessingInputsOutcomesRegressionTest(String rating, String interestRate, String expectedResult) {		
		try {
			//rating = ">A";
			//interestRate = "2.0";
			// expectedResult = statusSuccessful;
			
			String bankAccountCreationStatus = bankAccount.getBankAccountStatus(rating, interestRate);
			System.out.println("bankAccountCreationStatus: " + bankAccountCreationStatus);
			
			Assert.assertEquals(expectedResult, bankAccountCreationStatus);
			System.out.println("Test passed");
		} catch (Exception e) {
			System.out.println("Test failed");
			Assert.fail();
		}  catch (AssertionError e) {
			System.out.println("Test failed");
			Assert.fail();
		}
	}
}
