package org.test;



public class StringFindOut {
	public static void main(String[] args) {
		String s="nGGJkj21wdhd@#$12jdbj";
		
	
		
		String Upp="";
		String low="";
		String spl= "";
		String num="";
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isDigit(ch)) {
				num=num+ch;
				}
			else if (Character.isUpperCase(ch)) {
				Upp=Upp+ch;
				
			}
			else if (Character.isLowerCase(ch)) {
				low=low+ch;
				
			}
			else {
				spl=spl+ch;
				
				
			}
		}
		
				
			System.out.println(Upp);
			System.out.println(low);
			System.out.println(spl);
			System.out.println(num);
				
				
		
			
			
		}
	

	}



