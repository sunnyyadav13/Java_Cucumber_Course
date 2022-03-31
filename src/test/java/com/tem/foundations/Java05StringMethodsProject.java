package com.tem.foundations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

/**
 * *********************************
 * @author ash
 * @date 8 May 2020
 * @project JavaForTestAutomation
 **********************************
 */
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Java05StringMethodsProject {
	
	/*
	 * Bank Transaction Message (Ex: Transaction TN1230000001 was successfully completed),
       Bank Transaction Status (Pending),
       BusinessName and Amount
	 */
	
	private String actualBankTransactionMessage = "Transaction TN1230000001 was successfully completed";
	private String actualBankTransactionStatus = "Pending";
	private String actualBankBusinessName = "ABC Ltd";
	private String actualBankAmount = "£100000";
	
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
	public void test01TransactionLowerUpperCase() {
		String strLowercase = actualBankTransactionMessage.toLowerCase();
		System.out.println("strLowercase" + strLowercase);
		actualBankTransactionMessage.toUpperCase();
	}
	
	@Test
	public void test02TransactionIgnoreCase() {
		try {
			String expectedBankTransactionStatus = "pending";
			
			//Assert.assertEquals(expectedBankTransactionStatus, actualBankTransactionStatus);
			Assert.assertTrue(expectedBankTransactionStatus.equalsIgnoreCase(actualBankTransactionStatus));
			System.out.println("Test passed");
		} catch (AssertionError e) {
			System.out.println("Test failed");
			Assert.fail();
		}
	}
	
	@Test
	public void test03TransactionContains() {
		try {
			String expected = "successfully completed";
			boolean actual = actualBankTransactionMessage.contains(expected);
			Assert.assertTrue(actual);
			System.out.println("Test passed");
		} catch (AssertionError e) {
			System.out.println("Test failed");
			Assert.fail();
		}
	}
	
	@Test
	public void test04TransactionStartWith() {
		try {
			String expected = "Transaction";
			Assert.assertTrue(actualBankTransactionMessage.startsWith(expected));
			System.out.println("Test passed");
		} catch (AssertionError e) {
			System.out.println("Test failed");
			Assert.fail();
		}
	}
	
	@Test
	public void test05TransactionEndsWith() {
		try {
			String expected = "successfully completed";
			Assert.assertTrue(actualBankTransactionMessage.endsWith(expected));
			System.out.println("Test passed");
		} catch (AssertionError e) {
			System.out.println("Test failed");
			Assert.fail();
		}
	}
	
	@Test
	public void test06TransactionEmpty() {
		try {
			String APIBankTransactionMessage = "Transaction TN1230000001 was successfully completed";
			//String APIBankTransactionMessage = "";
			boolean empty = APIBankTransactionMessage.isEmpty();
			System.out.println("APIBankTransactionMessage: " + APIBankTransactionMessage);
			
			Assert.assertTrue(!empty);
			System.out.println("Test passed - " + APIBankTransactionMessage);
			
		} catch (AssertionError e) {
			System.out.println("Test failed");
			Assert.fail();
		}
	}
	
	@Test
	public void test07TransactionNull() {
		try {
			//String APIBankTransactionMessage = null;
			String APIBankTransactionMessage = "test";
			boolean nullValue = (APIBankTransactionMessage != null);
			System.out.println("nullValue: " + nullValue);
		
			System.out.println("APIBankTransactionMessage: " + APIBankTransactionMessage);
			
			Assert.assertNotNull(APIBankTransactionMessage);
			System.out.println("Test passed - " + APIBankTransactionMessage);			
		} catch (AssertionError e) {
			System.out.println("Test failed");
			Assert.fail();
		}
	}
	
	/**
	 * Matches - regular expression
	 * matches
	 */
	@Test
	public void test08TransactionMatch() {
		try {
			actualBankBusinessName = "ABC Ltd.";
			String regEx = "^[a-zA-Z. ]+$";
			
			boolean name = actualBankBusinessName.matches(regEx);
			System.out.println("name - " + name);
			
			Assert.assertTrue(Pattern.matches(regEx, actualBankBusinessName));
			System.out.println("Test passed - " + name);
		} catch (AssertionError e) {
			System.out.println("Test failed");
			Assert.fail();
		}
	}
	
	
	
	@Test
	public void test09TransactionTrim() {
		try {
			String expected = "ABC Ltd";
			System.out.println(expected);
			actualBankBusinessName = "    ABC Ltd      ";
			System.out.println(actualBankBusinessName);
			System.out.println(actualBankBusinessName.trim());
		} catch (AssertionError e) {
			System.out.println("Test failed");
			Assert.fail();
		}
	}
	
	/**
	 * Split
	 */
	
	@Test
	public void test10TransactionSplit() {
		try {
			// "Transaction TN1230000001 was successfully completed"
			String[] str = actualBankTransactionMessage.split("TN");
			System.out.println(str[0]);
			System.out.println(str[1]);
			
			System.out.println(str[0].concat(str[1]));
			
			String[] strAmount = actualBankAmount.split("£");
			System.out.println(strAmount[1]);
		} catch (AssertionError e) {
			System.out.println("Test failed");
			Assert.fail();
		}
	}
	
	
	/**
	 * Extract
	 * substring
	 * Pattern/group
	 */
	
	@Test
	public void test11TransactionExtract() {
		try {
			actualBankTransactionMessage = "Transaction TN1230000001 was successfully completed TN1230000001";
			
			// substring
			String subStr = actualBankTransactionMessage.substring(12, 25);
			System.out.println("subStr: " + subStr);			
			
			// Pattern/group
			String regEx = "(TN\\d+)";
			Pattern pattern = Pattern.compile(regEx);
			Matcher match = pattern.matcher(actualBankTransactionMessage);
			
			while(match.find()) {
				System.out.println("matched group: " + match.group(1));
			}
		} catch (AssertionError e) {
			System.out.println("Test failed");
			Assert.fail();
		}
	}
	
	@Test
	public void test12TransactionStringConversion() {
		try {
			int intDays = 0;
			String group = null;
			
			actualBankTransactionMessage = "Amount will be credited into your business account in 3 days";		
			
			// Pattern/group
			String regEx = "(\\d+)";
			Pattern pattern = Pattern.compile(regEx);
			Matcher match = pattern.matcher(actualBankTransactionMessage);
			
			while(match.find()) {
				System.out.println("String days: " + match.group(1));
				group = match.group(1);
				intDays = Integer.parseInt(group);
				System.out.println("intDays: " + intDays);
			}
			
			System.out.println("Process account in days: " + (intDays-1) );
		} catch (AssertionError e) {
			System.out.println("Test failed");
			Assert.fail();
		}
	}
		
		@Test
		public void test13TransactionIntConversion() {
			try {
				int actualAmount = 100000;
				String gbpSign = "£";
				String sAccountAmount = String.valueOf(actualAmount);
				
				System.out.println(gbpSign.concat(sAccountAmount));
			} catch (AssertionError e) {
				System.out.println("Test failed");
				Assert.fail();
			}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
