package Javaexam;

import java.util.Scanner;

public class Q21StringToInteger {

	public static void main(String[] args) {
		System.out.println("Enter a string (number) to perform arithmetic operation:");
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();	
        int i=Integer.parseInt(s1);
        System.out.println("You entered:"+s1);
        System.out.println("Converted to integer "+i);
        System.out.println("Sum of all integers till the given number" + (i*(i+1)/2));
	

	}

}
