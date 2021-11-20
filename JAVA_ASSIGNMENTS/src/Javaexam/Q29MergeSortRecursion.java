package Javaexam;
import.java.util.List;
public class Q29MergeSortRecursion {
	public static class MergeSort{

	
			     /** The method for sorting the numbers */
			     public  void mergeSort(int[] list) {
			        if (list.length > 1) {
			        											// Merge sort the first half
			          int[] firstHalf = new int[list.length / 2];
			          System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
			         mergeSort(firstHalf);			   
			         												// Merge sort the second half
			         int secondHalfLength = list.length - list.length / 2;
			        int[] secondHalf = new int[secondHalfLength];
			        System.arraycopy(list, list.length / 2,
			          secondHalf, 0, secondHalfLength);
			        mergeSort(secondHalf);
			  
			        												// Merge firstHalf with secondHalf into list
			        merge(firstHalf, secondHalf, list);
			     
			    	public static void main(String[] args) {	        
			        
			        
			        
			        }           
			        
			        
			   }
	
	

