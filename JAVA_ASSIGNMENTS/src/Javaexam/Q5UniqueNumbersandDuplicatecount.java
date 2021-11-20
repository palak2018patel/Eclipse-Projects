package Javaexam;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q5UniqueNumbersandDuplicatecount {
private static Scanner sc;
public static void main(String[] args) {
	int size,i,j,count=0;
	Scanner sc =new Scanner (System.in);
	System.out.println(" Please enter the duplicate array size: ");
	size= sc.nextInt();
	int[] arr=new int[size];
	System.out.println("\n Enter duplicate Array elements: ");
	for(i=0;i<size;i++) {
		arr[i]=sc.nextInt();
		}
		for(i=0;i<size;i++){
			for(j=i+1;j<size;j++) {
				if(arr[i]==arr[j]) {
					count++;
					break;
				}
			}
		}
		System.out.println("\nThe total no of duplicates= "+count);
		Set<Integer>s=new HashSet<Integer>();
		for(i=0;i<size;i++){
			s.add(arr[i]);
		}
		System.out.println("The unique numbers of the array are: ");
System.out.println(s);
		}		       
	}


