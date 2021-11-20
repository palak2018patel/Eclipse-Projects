package Javaexam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Q30LongestPalindrome {
	
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
		System.out.print("Enter two palindrome strings");		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String []strArray=s.split("\\s+");
		ArrayList<String>arr=new ArrayList<String>();{
		for( int i=0;i<strArray.length;i++){
			String str=strArray[i];
			System.out.println("String "+str+"is Palindrome"+palindrome(str));
			arr.add(str);
		}
		int in=0;
		for(in=0;in<=arr.size();in++) {
			arr(in)
			}
		
		}
		
		System.out.println("The longest palindrome of the two strings is"+arr(in).compareToarr(in+1));
		}}


		
		
		
		
		


