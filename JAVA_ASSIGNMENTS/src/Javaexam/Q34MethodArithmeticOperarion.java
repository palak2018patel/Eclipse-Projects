package Javaexam;

import java.util.Scanner;

public class Q34MethodArithmeticOperarion {

	public static void main(String[] args) {		    
		  
		    int first, second, add, subtract, multiply;
		    float divide;
		    Scanner scanner = new Scanner(System.in);

		    System.out.print("Enter Two Numbers : ");
		    first = scanner.nextInt();
		    second = scanner.nextInt();

		    add = first + second;
		    subtract = first - second;
		    multiply = first * second;
		    divide = (float) first / second;

		    System.out.println("Sum = " + add);
		    System.out.println("Difference = " + subtract);
		    System.out.println("Multiplication = " + multiply);
		    System.out.println("Division = " + divide);
		  
		


	}

}
