package com.qa.IntegrationTests;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

	public static void main(String[] args) {
		TestRunner runner = new TestRunner();
		runner.runAllTests();
	}
	
	
	public void runAllTests() {
		Result result = JUnitCore.runClasses(
				SuiteLogin.class,
				SuiteHomepage.class
				);
		
		System.out.println("All tests passed: " + result.wasSuccessful());
		
		if(!result.wasSuccessful()) {
			System.out.println("Failed Tests: ");
			for(Failure fail: result.getFailures()) {
				System.out.println(fail.getMessage());
			}
		}
	}
}
