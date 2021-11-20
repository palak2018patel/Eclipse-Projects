package Javaexam;

import java.util.Scanner;

public class Q22IntToString {

	public static void main(String[] args) {
		System.out.println("Enter a integer number to convert to string:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();	
		String s=String.valueOf(num);
		System.out.println("Using value of method "+s);
	}

}
