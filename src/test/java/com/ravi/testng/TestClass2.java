package com.ravi.testng;

import org.testng.annotations.Test;

public class TestClass2 {
	@Test
	public void testMethod5() {
		
		System.out.println("testClass 2 >> testMethod1 >> "+Thread.currentThread().getId());
	}
	@Test
	public void testMethod6() {
		System.out.println("testClass 2 >> testmethod2 >> "+Thread.currentThread().getId());
	}
	@Test
	public void testmethod7() {
		
		System.out.println("testClass 2 >> testmethod3 >> "+Thread.currentThread().getId());
		
	}
}
