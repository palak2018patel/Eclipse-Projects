package CollectionsFrameworkASSIGNMENTS;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Iteratordemofailsafe {

	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer>list=new CopyOnWriteArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		Iterator<Integer> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			list.add(5);// Will not print nor prevent the printing of the original list
		}

	}

}
