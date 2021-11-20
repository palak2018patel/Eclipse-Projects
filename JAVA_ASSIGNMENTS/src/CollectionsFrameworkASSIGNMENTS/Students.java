package CollectionsFrameworkASSIGNMENTS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.*;
public class Students {
	String name;
	int id;
	int roll;
	
	Students(String name, int id, int roll){
		this.id=id;
		this.name=name;
		this.roll=roll;
				
	}

	public static void main(String[] args) {
		//List<Students>lis=new ArrayList<Students>();		//can hold objects bt was unable to use sort of string function on names
List<Students>arr=new ArrayList<Students>();
Students s1=new Students("xyz", 1,5);
Students s2=new Students("pqr", 2,3);
Students s3=new Students("uvw", 3,2);
Students s4=new Students("lmn", 4,1);
Students s5=new Students("def", 5,4);
Students s6=new Students("abc", 6,6);

arr.add(s1);
arr.add(s2);
arr.add(s3);
arr.add(s4);
arr.add(s5);
arr.add(s6);
Collections.sort(arr);
Iterator<Students> it=arr.iterator();
while (it.hasNext()) {
	
	//System.out.println(it.next());

System.out.println("Sorted List is:" +arr);
	
}
	}
	
		
}	

