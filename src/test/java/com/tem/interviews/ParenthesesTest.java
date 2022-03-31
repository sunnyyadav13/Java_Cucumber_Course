package com.tem.interviews;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

import org.junit.Assert;
import org.junit.Before;

/**
 * *********************************
 * @author ash
 * @date 5 Jul 2020
 * @project JavaForTestAutomation
 **********************************
 */
public class ParenthesesTest {
	String actualText;
	int countLeftPara = 0;
	int countRightPara = 0;
	
	String leftPararegEx = "(\\()";
	String rightPararegEx = "(\\))";
	
	ParenthesesUsingOOP para;
	
	@Before
	public void beforeTest() {
		para = new ParenthesesUsingOOP();
	}

	@Test
	public void testParanthesesValidInput() {
		actualText = "Sometimes ((I (am) too much (confused (when))) there are multiple parentheses in a sentence)";
		
		try {
			// Left para
			countLeftPara = para.getPatternMatcher(leftPararegEx, actualText);
			System.out.println("countLeftPara:" + countLeftPara);
			
			// Right para
			countRightPara = para.getPatternMatcher(rightPararegEx, actualText);
			System.out.println("countRightPara:" + countRightPara);
			
			Assert.assertEquals(countLeftPara, countRightPara);
			System.out.println("Test Passed");
		} catch (AssertionError e) {
			System.out.println("Test failed");
			Assert.fail();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
