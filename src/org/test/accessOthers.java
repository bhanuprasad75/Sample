package org.test;

import java.util.Scanner;

public class accessOthers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original, reverse = "";
	      Scanner in = new Scanner(System.in);
	     
	      System.out.println("Enter a string to reverse\n");
	      original = in.nextLine();
	     
	      int length = original.length();
	     
	      for (int i = length - 1 ; i >= 0 ; i--)
	    	  
	         reverse = reverse + original.charAt(i);
	         
	      System.out.println("Reverse of the string: " + reverse);
	      
	      if (original.equals(reverse)){
	    	  System.out.println("palindrome");
	      }
	      else {
	    	  System.out.println("Not an palindrome");
	    	  }
	}

private static void Sysout() {
		// TODO Auto-generated method stub
		System.out.println("Ragul");
		accessOthers.Sysout();}

	public void bhanu() {
			System.out.println("bhanu");
			accessOthers ac=new accessOthers();
			ac.bhanu();

			System.out.println("Added");

			
			String num="";
			String alp="";
			String e="bhanuprasad123";
			int len = e.length();
			for (int i = 0; i < len; i++) {
				char c = e.charAt(i);
				if (Character.isDigit(c)) {
					System.out.println(num=num+c);
					
				}
				else {
					System.out.println(alp=alp+c);
				}
					
				
			}
	}
	
	
	
}
