package CollectionsFrameworkASSIGNMENTS;
import java .util.LinkedList;
import java.util.TreeSet;

public class LinkedlistSortingNos {

	public static void main(String[] args) {
	LinkedList<Object>llo=new LinkedList<>();
	llo.add(4);
	llo.add(2);
	llo.add(3);
	llo.add(5);
	llo.add(1);
	TreeSet<Object> tree=new TreeSet<Object>(llo);	
	System.out.println("Contents of the linkedlist in the ascending order:  ");
	System.out.println(tree);
	
		}
		
		
}


