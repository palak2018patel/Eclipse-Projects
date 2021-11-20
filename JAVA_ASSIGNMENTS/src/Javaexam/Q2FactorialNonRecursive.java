package Javaexam;
import java.util.Scanner;

public class Q2FactorialNonRecursive {
	static long fact=1L;
	public static long fact(long num) {		//iterative approach
		while(num!=0) {
			fact=fact*num;
			num--;			
		}
		return fact;
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
	


