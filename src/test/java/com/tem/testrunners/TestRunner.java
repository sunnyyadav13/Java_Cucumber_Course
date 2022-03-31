package com.tem.testrunners;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.tem.oop.BankAccountCreationRegressionTest;
import com.tem.oop.BankAccountCreationSmokeTest;
import com.tem.oop.BankAdvanceAccountCreationRegressionTest;


@RunWith(Suite.class)
@SuiteClasses(
		{ BankAccountCreationRegressionTest.class, 
			BankAccountCreationSmokeTest.class,
			BankAdvanceAccountCreationRegressionTest.class
			})
public class TestRunner {

}