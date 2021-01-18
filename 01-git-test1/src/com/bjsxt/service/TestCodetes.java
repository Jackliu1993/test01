package com.bjsxt.service;
/**
 * 
 * 
 * @author Legion
 * @date 2020年4月24日
 * 
 */
public class TestCodetes {
	public static void testMethod() {
		System.out.println("TestCodetes.testMethod()");
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("TestCodetes.equals()");
		return super.equals(obj);
	}
	
	@Override
		public String toString() {
			System.out.println("TestCodetes.toString()");
			return super.toString();
		}
}
