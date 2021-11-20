package Javaexam;

import java.util.Scanner;

public class Q23DifferentiateStringIntBool {

	public static void main(String[] args) {
		boolean boolint=false;
		boolean boolboo=false;
		Scanner sc= new Scanner(System.in);		
		System.out.println("Please enter a string or integer or boolean");
		String s= sc.next().toLowerCase();
		
		if(s.matches("[0-9]+")){
			System.out.println("You entered an integer ");
			boolint=true;
				}
		if((s.equals("true"))||(s.equals("false"))){
			boolboo=true;
			System.out.println("You entered a boolean ");
		}
		
		if((!boolint)&&(!boolboo))
		{
		
			System.out.println("You entered a string  ");
		}		 
		sc.close();
		}
	}
		
			
	
	


