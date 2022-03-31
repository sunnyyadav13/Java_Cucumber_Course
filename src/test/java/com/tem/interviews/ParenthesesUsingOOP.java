package com.tem.interviews;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

import org.junit.Assert;

/**
 * *********************************
 * @author ash
 * @date 5 Jul 2020
 * @project JavaForTestAutomation
 **********************************
 */
public class ParenthesesUsingOOP {
	//String actualText;
	//int countLeftPara = 0;
	//int countRightPara = 0;
	
	Pattern pattern;
	Matcher match;
	
	//String leftPararegEx = "(\\()";
	//String rightPararegEx = "(\\))";
	
	public int getPatternMatcher(String regEx, String actualText) {
		int para = 0;
		pattern = Pattern.compile(regEx);
		match = pattern.matcher(actualText);
		
		while(match.find()) {
			System.out.println("Matched group: " + match.group());
			para++;
		}
		
		return para;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
