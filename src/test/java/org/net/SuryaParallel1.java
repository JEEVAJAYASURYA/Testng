package org.net;

import org.testng.annotations.Test;

public class SuryaParallel1 {
	@Test
	private void tc11() {
		System.out.println("test11:"+Thread.currentThread().getId());

	}
	@Test
	private void tc22() {
	System.out.println("test22:"+Thread.currentThread().getId());

	}
	@Test
	private void tc33() {
	System.out.println("test33:"+Thread.currentThread().getId());

	}
	@Test
	private void tc44() {
		System.out.println("test44:"+Thread.currentThread().getId());

	}
}
