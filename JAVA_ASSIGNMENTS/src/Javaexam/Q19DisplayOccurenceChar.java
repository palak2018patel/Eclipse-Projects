package Javaexam;
import java.util.Arrays;
import java.util.Scanner;
public class Q19DisplayOccurenceChar {	
	public static void Count(String str) {
		int upper=0;
		int lower=0;
		int number=0;
		int special=0;
		char[]strarr=str.toCharArray();
		for(int i=0;i<strarr.length;i++)
		{
			if(strarr[i]>='A'&& strarr[i]<='Z' ) 
				upper++;
			if(strarr[i]>='a'&& strarr[i]<='z' ) 
				lower++;
			if(strarr[i]>='0'&& strarr[i]<='9' ) 
				number++;
			else
				special++;
		}
			System.out.println("Uppercase letters :"+upper);
			System.out.println("Lowercase letters :"+lower);
			System.out.println("Numbers           :"+number);
			System.out.println("Special characters:"+special);			
		}		
	public static void main(String[] args) {
		System.out.println("Enter a string with number,characters,upper and lower case letters :");
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();	
        System.out.println("The total number of  :" );
        Count(s1);  
        sc.close();
	}
}


