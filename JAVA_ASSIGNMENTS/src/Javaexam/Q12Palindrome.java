package Javaexam;

import java.util.Scanner;
public class Q12Palindrome {
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
					String s1="MalayalaM";
					System.out.println("MalayalM is a palindrome "+palindrome(s1));						
					System.out.println("Enter a string or a number to check:");
			        Scanner sc=new Scanner(System.in);
			         String s=sc.nextLine();	
			         System.out.println("Given input is a palindrome "+palindrome(s));
			         sc.close();		
	
}
		
		}

			
		
