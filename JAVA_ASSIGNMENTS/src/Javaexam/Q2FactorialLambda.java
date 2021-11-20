package Javaexam;
import java.util.Scanner;
import java.util.stream.LongStream;

public class Q2FactorialLambda { //Using Stream and Lambda function
public static long fact(long num) {
	return LongStream.rangeClosed(2, num).reduce(1, (long a,long b)->a*b);
	
}
	public static void main(String[] args) {
		long num;				
		System.out.println("Enter a number to find its factorial:");
        Scanner sc=new Scanner(System.in);
         num=sc.nextLong();		        
		System.out.println("The factorial of "+num+" is: "+fact(num));
        sc.close();	
	}

}
