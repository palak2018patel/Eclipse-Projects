package ASSIGNMENTS;

import java.util.Scanner;

public class Account {
	int a,b;
	public void setScanData () {
		System .out.println(" Enter an integer:  ");
		Scanner sc_a= new Scanner(System.in);
		int a=sc_a.nextInt();
		System .out.println(" Enter an integer:  ");
		Scanner sc_b= new Scanner(System.in);
		int b=sc_b.nextInt();
		this.a=a;
		this.b=b;
		}
	public void showData() {
		System.out.println("value of first integer is "+a);
		System.out.println("Value of second integer is "+b);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account obj=new Account ();
		obj.setScanData();
		obj.a=2;
		obj.b=3;
		obj.showData();
	}
}
