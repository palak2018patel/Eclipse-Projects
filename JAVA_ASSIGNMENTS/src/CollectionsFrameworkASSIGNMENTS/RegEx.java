package CollectionsFrameworkASSIGNMENTS;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

	public static void main(String[] args) {
		//Array of character--character sequence--pattern e.g. Palak@gmail.com, java
		//characters,wildcards,charactersequence
		//Pattern
		//Matcher
		//escape sequence \, \n
		System.out.println("This is a java \n programming");
//java with java
//jAVa with[a-z][A-Z] will match with j and A only first two char//
// [abc]--->a or b or c
		//[*abc]-->ecxept a or b or c
		//[0-9][5-9]-->0
		//ib12-->[1-9][a-z]
		//1 with [1-9]*
		//12 with[1-9]?//123 with[1-9]?
		//Quantifiers
		//+-->one or more no of char
		//*-->zero or more number of characters
		//?match zero or one number characters
	
	Pattern pat=Pattern.compile("java");//(j.+d)//pat("1-9+")mat("123 456 678") will say String matched
	Matcher mat=pat.matcher("java program");//("java sessions ended")with the above will return matched
			System.out.println(mat.matches());
			
	//if(mat.matches())		
	String result = (mat.matches())?"String matched":"String didnot match";
	System.out.println(result);
	String result1 = (mat.find())?"String matched":"String didnot match";
	System.out.println(result1+" "+mat.group());	
	}

}
