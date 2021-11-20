package Javaexam;

public class Q15Reverse2Words {

	public static void main(String[] args) {		
			String s="Java Code";
			String s1=s.replace("Java ", "");
			String s2=s.replace("Code", "");
			String s3=s1.concat(s2 );
			System.out.println(s3);
		}

	}


