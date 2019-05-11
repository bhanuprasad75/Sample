package org.test;

import java.util.Scanner;

public class Child implements parent1,parent2 {

	@Override
	public void exam3() {
	System.out.println("***");
	System.out.println("10");
	System.out.println("1or5");
		
	}

	@Override
	public void exam1() {
		System.out.println("25");
		
	}

	@Override
	public void exam2() {
		System.out.println("45");
		
	}
	public static void main(String[] args) {
		Child c=new Child();
		c.exam3();
		c.exam1();
		c.exam2();
		
	}
	
	
	
	
	

}
