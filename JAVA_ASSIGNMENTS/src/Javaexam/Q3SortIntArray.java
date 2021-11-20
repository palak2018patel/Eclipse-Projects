package Javaexam;
import java.util.Arrays;

public class Q3SortIntArray {

	public static void main(String[] args) {
		
				int[] arr= {1,4,3,9,6,8,5,7,2,0};
				System.out.println("Given array ");
				for(int num:arr) {
					System.out.print(" "+num);			
				}
				Arrays.sort(arr);
				System.out.println("\nSorted array ");
				for(int num:arr) {
					System.out.print(" "+num);
				}

			}

		}


	


