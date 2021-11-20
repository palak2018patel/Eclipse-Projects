package Javaexam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Q4PalindromeOfIntegers {
	private static boolean palindrome(String s1) {
		{
			int length=s1.length();
			for(int i=0; i<length/2;i++) {
				if(s1.charAt(i)!=s1.charAt(length-1-i)) {
					return false;
				}	
				return true;
			}
		}
		return false;
	}		

	public static void main(String[] args) {
		int []arr= {12,4545,1331,1524};		
		
		for(int i=0;i<arr.length;i++) {			
			String s=String.valueOf(arr[i]);
			System.out.println("Integer "+arr[i]+" is Palindrome " +palindrome(s));
			
		}
			
		
	}

}
