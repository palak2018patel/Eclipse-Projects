package Javaexam;
import java.util.Scanner;
public class Q20TotalRepeatedChar {
	static int  count;
	public static void Counter (String s) {
		
		String s1=String.valueOf(s);
		char[]strarr=s1.toCharArray();	
		
		for(int i=0;i<strarr.length;i++) {
			 char ch=strarr[i];
			 count=0;
			for(int j=i+1;j<strarr.length;j++) {
				
				if(strarr[i]==strarr[j]) {
					count++;
					for(int k=j;k<(strarr.length-1);k++)
						strarr[k]=strarr[k+1];
					strarr.length--;
					j--;
				}
				}																
					}			
	}		
	/*for(int k=0; k<str1.length();k++) {
	char ch=str1.charAt(k);		
	
	for (int j=k+1; j<str1.length(); j++) {
		if (str1.charAt(k)== str1.charAt(j)) {
			//duplicateChar = true;
			System.out.print("Duplicate character is " +str1.charAt(j));
			break;
		}
count=str1.length()-str2.length();
	}
}*/

System.out.println("The number of duplicates in the string " +count);
	
	public static void main(String[] args) {		
		System.out.println("Enter a string with integers and letters");
		Scanner sc=new Scanner (System.in);
		String str=sc.nextLine();
		
		Counter(str);		
		sc.close();		
	}

}
