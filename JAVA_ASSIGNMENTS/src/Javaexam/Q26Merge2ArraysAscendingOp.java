package Javaexam;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Q26Merge2ArraysAscendingOp {

	public static void main(String[] args) {
		
	Integer[]A= {1,2,4,6,9,10};
	Integer[]B= {3,5,7,8};
		
		Set<Integer>set1=new TreeSet<Integer>();
		set1.addAll(Arrays.asList(A));
		Set<Integer>set2=new TreeSet<Integer>();
		set2.addAll(Arrays.asList(B));
		System.out.println("Before merging ");
		System.out.println("Array A "+(set1));
		System.out.println("Array B"+(set2));		
		set1.addAll(set2);
		System.out.println("After merging ");
		System.out.println(set1);
		
	}

}
