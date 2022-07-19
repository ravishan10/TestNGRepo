package com.ravi.testng;

import org.testng.annotations.Test;

public class TestClass3 {
	@Test
	public void testmethod8() {
		
		System.out.println("testClass 3 >> testMethod 8 >> "+Thread.currentThread().getId());
		
	}
	@Test
	public void testmethod9() {
		
		System.out.println("testClass 3 >> testMethod 9 >> "+Thread.currentThread().getId());
		
	}
	@Test
	public void testMethod10() {
		System.out.println("testClass 3 >> testMethod 10 >> "+Thread.currentThread().getId());
	}
}
