package CollectionsFrameworkASSIGNMENTS;
import java.util.Iterator;
import java .util.LinkedList;
import java .util.Queue;

public class PeekPoll {

	public static void main(String[] args) {
		Queue<String> queue= new LinkedList<String>();
		queue.add("Java0");
		queue.add("Java1");
		queue.add("Java2");
		queue.add("Java3");
		queue.add("Java4");
		queue.add("Java5");
		System.out.println("Element at the top of the queue: "+queue.peek());
		//System.out.println("Element at the top of the queue: "+queue.poll());
		Iterator<String> s=queue.iterator();
		System.out.println("Contents of the queue:  ");;
		while(s.hasNext()) {
			System.out.println(s.next());
			}
	}
		

	}


