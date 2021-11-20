package CollectionsFrameworkASSIGNMENTS;
import java.util.ArrayList;
import java.util.Iterator;
public class Iteratordemo {

	public static void main(String[] args) {
		ArrayList<Object> AL = new ArrayList<Object>();
		AL.add(100);
		AL.add(200);
		AL.add(300);
		AL.add(400);
		AL.add(500);

Iterator<Object> itr=AL.iterator();
//AL.remove(3);
System.out.println(AL);
while(itr.hasNext())
{
	System.out.println(itr.next());
	AL.remove(2);   //Failfast:Exception occurs
}
	}
}