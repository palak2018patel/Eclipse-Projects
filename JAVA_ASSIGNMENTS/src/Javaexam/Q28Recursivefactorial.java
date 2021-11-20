package Javaexam;

import java.util.Scanner;

public class Q28Recursivefactorial {
public static long fact(long n) {
	if (n<=1)
		return 1;
	else return n*fact(n-1);
}
	public static void main(String[] args) {
		System.out.println("Enter a number to find its factorial:");
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        System.out.println("The factorial of "+n+" is: "+fact(n));
        sc.close();
	}

}
