package com.tem.oop;

/**
 * 
 * TYPES of Inheritance:
 * 1. Single Inheritance: 
 * once class extends another class.
 * 
 *   Multiple Inheritance:
 *   one class extending more than one class
 *   [NOT allowed in Java]
 * 
 * 2. Multilevel inheritance: 
 * a class extends the CHILD class 
 * Examples: Sprints and new features in every sprint
 * 
 * 3. Hierarchical inheritance:
 * more than one class extends the same class
 * Example: BaseTest
 * 
 */

class First {
	void display() {
		System.out.println(" Parent Class one ");
	}

	void signEnd() {
		System.out.println("End..");
	}
}

class Second extends First {
	void display() {
		super.display();// calls parent class member
		System.out.println(" Parent Class Two ");
	}
}

class Third extends Second {
	void signStart() {
		System.out.println("Start..");
	}
	
	void display() {
		super.display();
		System.out.println(" Child Class Three\n");
		signEnd();
	}
}

public class MultiLevelInheritance {
	public static void main(String[] args) {
		System.out.println("Multi-level inheritance\n");
		Third obj = new Third();
		obj.signStart();
		obj.display();
	}
}



