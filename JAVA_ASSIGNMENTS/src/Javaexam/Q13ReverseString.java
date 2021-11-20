package Javaexam;
import java.util.Scanner;

public class Q13ReverseString {
	public static class StringFormatter{
		public static String reverseString(String s) {
			StringBuilder sb=new StringBuilder(s);
			sb.reverse();
			return sb.toString();
		}
	}
	public static void main(String[] args) {
		System.out.println(StringFormatter.reverseString("Java Code"));
		System.out.println("Enter a string to reverse:");
        Scanner sc=new Scanner(System.in);
         String s1=sc.nextLine();	
         System.out.println(StringFormatter.reverseString(s1));
         sc.close();
	}

}
