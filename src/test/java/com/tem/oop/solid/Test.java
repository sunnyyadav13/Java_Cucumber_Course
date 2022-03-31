package com.tem.oop.solid;

public class Test {

	/* B obj = new B();*/
	@org.junit.Test
	public void testSub() {
		
		//SuperClass sup = new SubClass();
		
		String s = "test";
		SubClass sub = new SubClass();
		
		sub.methodA();
		
		sub.methodA(s);
		
		sub.methodC();
		
		//sub.methodB(sup);
	}
	
	/*A obj = new B();*/
	@org.junit.Test
	public void testSup() {
		String s = "test";
		SuperClass sup = new SubClass();
		
		sup.methodA();
		
		((SubClass)sup).methodA(s); // type casting
		
		sup.methodB(sup);
	}
}
