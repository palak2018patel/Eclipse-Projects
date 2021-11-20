package CollectionsFrameworkASSIGNMENTS;

import java.util.Iterator;
import java.util.Stack;

public class Reverse {
	
public static void main(String[]args) {
	
	Stack<String>s1=new Stack<String>();
	
			
	s1.push("Bhagya");
	s1.push("Vartika");
	s1.push("Devipriya");
	s1.push("Saumya");
	s1.push("Kajal");
	s1.push("Likita");
	s1.push("Palak");
	Iterator<String>itr=s1.iterator();
	while (itr.hasNext()) {
	System.out.println(s1.pop());}	
	
}	

}
