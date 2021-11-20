package Javaexam;

import java.util.Scanner;

public class Q16RemoveCharFromString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the index position at which the given char is to be removed");
		int pos=sc.nextInt();		
		String str="Thiss is Java";
		System.out.println(removeCharAt(str,pos));
		sc.close();
	}
	
	public static String removeCharAt(String s, int pos) {
		
		return s.substring(0, pos)+s.substring(pos+1);
	}
}
