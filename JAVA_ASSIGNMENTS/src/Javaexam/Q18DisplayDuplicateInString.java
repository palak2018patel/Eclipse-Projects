package Javaexam;

public class Q18DisplayDuplicateInString {

	public static void main(String[] args) {
		String str1="Hello";
		String str2=new String();
		String str3=new String();
		System.out.println("OldString "+str1);
		int count=0;
		
		for(int i=0;i<str1.length();i++) {
			char ch=str1.charAt(i);
			
			if (str2.indexOf(ch)<0) {
				 str2=str2+ch;				
			}			
		}
		for(int k=0; k<str1.length();k++) {
			char ch=str1.charAt(k);		
			
			for (int j=k+1; j<str1.length(); j++) {
				if (str1.charAt(k)== str1.charAt(j)) {
					//duplicateChar = true;
					System.out.print("Duplicate character is " +str1.charAt(j));
					break;
				}
		count=str1.length()-str2.length();
			}
		}
System.out.println("\nWithout duplicates in the string " +str2);
System.out.println("The number of duplicates in the string " +count);

	}

	}

