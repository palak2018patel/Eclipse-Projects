package Javaexam;
import java.util.Scanner;
import java.util.Set;

public class Q18DisplayDuplicate {

	public static void main(String[] args) {		
		System.out.println("Enter a string with number,characters,upper and lower case letters :");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();	
			char[] chr=str.toCharArray();
			int length=chr.length;
			StringBuilder sb= new StringBuilder();
			boolean duplicateChar;
			for(int i=0; i<length;i++) {
				duplicateChar =false;
				for (int j=i+1; j<length; j++) {
					if (chr[i]== chr[j]) {
						duplicateChar = true;
							System.out.print(chr[i]);					
						break;
					}
				}				
				}			
				sc.close();		
			System.out.println (" are the duplicate characters in the string ");			
	}
	}


