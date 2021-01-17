package com.legion.test;

import java.util.Date;

public class HelloGit {

	public static void main(String[] args) {
		System.out.println("HelloGit.main(), now date is "+new Date());
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("HelloGit.equals().....");
		return super.equals(obj);
	}
	
	@Override
	public String toString() {
		System.out.println("HelloGit.toString(), now date is "+new Date());
		return "HelloGit.toString()";
		
	}
}
