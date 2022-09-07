package org.net;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Class {
	@Test
	private void tc1() {
		System.out.println("test1");

	}
	@Test(retryAnalyzer=Failed.class)
	private void tc2() {
		Assert.assertTrue(false, "testing");
		System.out.println("test2");

	}
	@Test
	private void tc3() {
		
		System.out.println("test3");
	}
	@Test
	private void tc4() {
		System.out.println("test 4");

	}
}
