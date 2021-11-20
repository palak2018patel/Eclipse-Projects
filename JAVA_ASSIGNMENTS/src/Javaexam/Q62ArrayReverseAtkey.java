package Javaexam;

import java.util.Arrays;

public class Q62ArrayReverseAtkey {

	public static void main(String[] args) {
		int k=3;
		int[] arr= {3,2,4,7,0,3,1,5,8,4};
		System.out.println("Given array ");
		for(int num:arr) {
			System.out.print(" "+num);			
		}
		Arrays.sort(arr);
		System.out.println("\nsorted array ");
		for(int num:arr) {
			System.out.print(" "+num);
		}

		

	}

}
