package com.bjsxt.service;
/**
 * 
 * 
 * @author Legion
 * @date 2020年4月24日
 * 
 */
public class TestClass {
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("TestClass.equals()");
		return super.equals(obj);
	}

	@Override
	public String toString() {
		System.out.println("TestClass.toString()");
		return super.toString();
	}
}
