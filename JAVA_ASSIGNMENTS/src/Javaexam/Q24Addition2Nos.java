package Javaexam;

import java.util.Scanner;

public class Q24Addition2Nos {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				System.out.println("Please enter a number   ");
				int num=sc.nextInt();
				int i,j,sum;
				sum=num;
				for(i=0;i<=num;i++) {
					for(j=i+1;j<=num;j++) {
						System.out.println(+sum+"= "+(num-j)+"+ "+j); 
					}
					break;								
				}				
	}

}
