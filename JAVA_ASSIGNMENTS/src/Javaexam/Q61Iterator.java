package Javaexam;

import java.util.ArrayList;
import java.util.Iterator;

public class Q61Iterator {

	public static void main(String[] args) {
		ArrayList<String> cars =new ArrayList<String>();
		cars.add("BMW");
		cars.add("Audi");
		cars.add("Volvo");
		cars.add("Ford");
		Iterator<String>itr=cars.iterator();
		while(itr.hasNext()) {
		System.out .println(itr.next());
		}
	}

}
