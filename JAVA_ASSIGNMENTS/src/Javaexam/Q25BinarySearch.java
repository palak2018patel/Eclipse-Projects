package Javaexam;

import java.util.Arrays;
import java.util.Scanner;

public class Q25BinarySearch {
public static void binarySearch(int arr[],int first,int last,int key) {
int mid=(first+last)/2;
while(first<=last) {
	if(arr[mid]<key) { 
		first=mid+1;
		}else if(arr[mid]==key) {
	System.out.println("Element is found at index: "+mid);
	break;
	}else {
		last=mid-1;
	}
	mid=(first+last)/2;
}
if(first>last) {
	System.out.println("Element is not found!");
}
}	
	public static void main(String[] args) {
		int size,i,j,count=0;
		Scanner sc =new Scanner (System.in);
		System.out.println(" Please enter the  array size: ");
		size= sc.nextInt();
		int[] arr=new int[size];
		System.out.println("\n Enter Array elements: ");
		for(i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			}
		Arrays.sort(arr);
		int last=arr.length-1;
		System.out.println("Enter the element to search ");
		int key=sc.nextInt();
		binarySearch(arr,0,last,key);	
	}	
		
	}


