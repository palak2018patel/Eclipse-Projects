package ASSIGNMENTS;

import java.util.*;
public class Stringassignment {
	//Removing Duplicates from a string

	public  static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hello";
		char chr[]=str.toCharArray();
		int length=chr.length;
		StringBuilder sb= new StringBuilder();
		boolean duplicateChar;
		for(int i=0; i<length;i++) {
			duplicateChar =false;
			for (int j=i+1; j<length; j++) {
				if (chr[i]== chr[j]) {
					duplicateChar = true;
					break;
				}
			}
			if (!duplicateChar) {
				sb.append(chr[i]);
			}
			}
		System.out.println (sb);
		
}
}
		

/*String s1= "Dog chases cat, Cat chases rat.";
System .out .println(s1);
System.out.println(s1.replace("cat","rat"));


String s2="this is me doing qa automation testing";
boolean has_qa=true;
int[] integerArray= {0,1,2,3,4,5,6,7,8,9};
System.out.println("this is me doing qa automation testing");
if(s2.contains("qa")) {
	has_qa=true;
	System.out.println("String 'qa' is present in the above sentence.");
}
*/

/*String a="12378";
boolean output=false;
for(int i= 0;i<a.length();i++) {
	boolean has_digit=Character.isDigit(a.charAt(i));
	
	if (has_digit) {
		System.out.println("String a has digit at index  "+i);
	output=true;}
	else 		
		{		
		output=false;
		System.out.println("String a does not have a digit at index  "+i);
	break;
	}
		}System.out.println("String a has only digits is  "+output);*/
		
		
		
		
/*String b="abc123";
boolean output=false;
for(int j= 0;j<b.length();j++) {
	boolean has_digit=Character.isDigit(b.charAt(j));
	
	if (has_digit) {
		System.out.println("String b has digit at index  "+j);
	output=true;}
	else 		
		{		
		output=false;
		System.out.println("String b does not have a digit at index  "+j);
	break;
	}
		}System.out.println("String b has only digits is  "+output);	*/	



		
			


	
 				
			

			

	

	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		



