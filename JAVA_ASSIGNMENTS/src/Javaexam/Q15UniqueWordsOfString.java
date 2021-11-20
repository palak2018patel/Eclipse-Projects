package Javaexam;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Q15UniqueWordsOfString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		String[]strArray=str.split("\\s+");                          //Split the string on the basis of the spaces
		Map<String,String>hMap=new LinkedHashMap<String,String>();  //Maps only hold unique keys (here we put string words as keys)
		for (int i=0; i<strArray.length;i++) {
			if(!hMap.containsKey(strArray[i])){
				hMap.put(strArray[i],"is unique");
			}
		}
			System.out.println(hMap);	
			sc.close();	
	}

}
