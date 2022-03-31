package com.tem.interviews;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

import org.junit.Assert;

/*
 * ---I will give you a text with multiple parentheses (), could you write a Java program to validate the open and closed parantheses are balanced?
	Note: you should NOT use char data type

	---Here you go.. the text is "Sometimes ((I (am) too much (confused (when))) there are multiple parentheses in a sentence)"
	
	---
	
	---
 */
/*
 * Test approach: 
 * Input: text with ()
 * Outputs:  count for ( and for )
 * Expect: counts should match - pass; doesn't match - fail
 * 
 * Manual test:
 * 
 * (High level)Automation script:
 * Define RegEx pattern
 * match group for (
 * count
 * match group for )
 * count
 * assert
 */

/**
 * *********************************
 * @author ash
 * @date 5 Jul 2020
 * @project JavaForTestAutomation
 **********************************
 */
public class Parentheses {
	String actualText;
	int countLeftPara = 0;
	int countRightPara = 0;
	
	Pattern pattern;
	Matcher match;
	
	String leftPararegEx = "(\\()";
	String rightPararegEx = "(\\))";
	
	@Test
	public void testParantheses() {
		actualText = "Sometimes ((I (am) too much (confused (when))) there are multiple parentheses in a sentence)";
		
		try {
			// Left para
			pattern = Pattern.compile(leftPararegEx);
			match = pattern.matcher(actualText);
			
			while(match.find()) {
				System.out.println("Matched group: " + match.group());
				countLeftPara++;
			}
			
			// Right para
			pattern = Pattern.compile(rightPararegEx);
			match = pattern.matcher(actualText);
			
			while(match.find()) {
				System.out.println("Matched group: " + match.group());
				countRightPara++;
			}
			
			Assert.assertEquals(countLeftPara, countRightPara);
			System.out.println("Test Passed");
		} catch (AssertionError e) {
			System.out.println("Test failed");
			Assert.fail();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
