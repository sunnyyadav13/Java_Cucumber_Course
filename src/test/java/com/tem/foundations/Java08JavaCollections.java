package com.tem.foundations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * *********************************
 * @author ash
 * @date 10 May 2020
 * @project JavaForTestAutomation
 **********************************
 */
public class Java08JavaCollections {
	/**
	 * 
	 */
	
	/**
	 * List interface
	 * ArrayList class
	 */
	@Test
	public void testListArrayListbasics() {
		// ArrayList Class
		ArrayList<String> roles = new ArrayList<String>();
		roles.add("software tester");
		roles.add("tester");
		roles.add("test specialist");
		
		System.out.println(roles.get(0));
		
		for(String role : roles) {
			System.out.println(role);
		}
		
		System.out.println("Length: " + roles.size());
		
		// List Interface
		// WebDriver driver = new ChromeDriver();
		List<String> rolesL = new ArrayList<String>();
		
		rolesL.add("sdet");
	}
	
	/**
	 * Set - interface
	 * Hashset - class
	 * 
	 * Cannot contain duplicate elements
	 */
	@Test
	public void testSetHashTest() {
		Set<String> hashset = new HashSet<String>();
		
		hashset.add("UK");
		hashset.add("USA");
		hashset.add("Italy");
		
		System.out.println(hashset);
		
		String source = "UK";
		if(hashset.contains(source)) {
			System.out.println("found");
		}else {
			System.out.println("not found");
		}
		
	}
	
	/**
	 * Map - interface
	 * hashmap - class
	 * 
	 * key-value pair
	 */
	@Test
	public void testCovidMapHashMap() {
		Map<String, Integer> covidCountryStats = new HashMap<String, Integer>();
		try{
			covidCountryStats.put("recovered", 111111110);
			covidCountryStats.put("active", 1111111111);
			covidCountryStats.put("critical", 22);
			
			Set<String> keys = covidCountryStats.keySet();
			
			for(String key : keys) {
				System.out.println("key: " + key);
				
				Integer stat = covidCountryStats.get(key);
				System.out.println("stat: " + stat);
				
				Assert.assertTrue("Value is not zero", (stat != 0));
			}
			System.out.println("Test passed");
		}catch(AssertionError e){
			System.out.println("Test failed");
			Assert.fail();
		}		
	}
	
	@Test
	public void testTemperatureMapHashMap() {
		Map<Object, Object> temperatureStats = new HashMap<Object, Object>();
		
		temperatureStats.put("london", "fff");
		temperatureStats.put("paris", 20.3);
		temperatureStats.put("rome", 23.4);
		
		System.out.println("temperatureStats: " + temperatureStats);
		
		Set<Object> keys = temperatureStats.keySet();
		System.out.println("keys: " + keys);
		for(Object key: keys) {
			System.out.println("Iterate through the set keys: " + key);
		}
		
		System.out.println(temperatureStats.values());
		for(Object value: temperatureStats.values()) {
			System.out.println("Iterate through the values: " + value);
		}
		
		System.out.println();
		System.out.println("key-value pair...");
		for(Object key:temperatureStats.keySet()) {
			System.out.println("key: " + key + " value: " + temperatureStats.get(key));
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
