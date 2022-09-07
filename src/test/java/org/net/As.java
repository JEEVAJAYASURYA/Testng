package org.net;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class As {
	@Test
	private void tc1() {
		System.out.println("test1");

	}
		@Test
		private void tc2() {
			SoftAssert s = new SoftAssert();
			s.assertTrue(false, "testing");
			
			System.out.println("green technologies");
			s.assertAll();
			System.out.println("test2");
	}
		//hard assert
		//@Test
		private void tc3() {
			Assert.assertTrue(false, "testing");
			System.out.println("test3");
	}
		@Test
	private void tc4() {
		System.out.println("test4");
		}
}
