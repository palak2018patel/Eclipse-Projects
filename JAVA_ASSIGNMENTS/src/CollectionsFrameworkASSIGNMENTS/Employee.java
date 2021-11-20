package CollectionsFrameworkASSIGNMENTS;
//import java.util.Collections;
//import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class Employee implements Comparable<Employee>{
	
	int empID;
	int empAge;
	String empName;
	Employee(int id, int age, String name){
		this.empID=id;
		this.empAge=age;
		this.empName=name;		
	}
	
	public static void main(String[] args) {
		Employee e1=new Employee(31,43,"Zalak1");
		Employee e2=new Employee(44,23,"Aalak2");
		Employee e3=new Employee(23,26,"Falak3");
		ArrayList<Employee>al=new ArrayList<Employee>();
		al.add(e1); //can also directly add to the list but I like step wise approach currently:al.add(new Employee(31,43,"Zalak1"));
		al.add(e2);
		al.add(e3);
		System.out.println("Before Sorting");
		Iterator<Employee>itr=al.iterator();
		while(itr.hasNext()) {                                              //here using iterator method to print the list, easy is using for and array method line 35
			Employee emp=itr.next();			
			System.out.println(emp.empName+"  "+emp.empAge+"  "+emp.empID);
		}
		
		System.out.println("After sorting by name");
		al.sort( (Employee x,Employee y)->(x.empName).compareTo(y.empName ) );//Using Lambda function sorting method, to sort by a particular parameter awesome!!!
		for(Employee e:al) {                                                  //Using for and array method to print the array list// very easy this way too!!!!
			
			System.out.println(e.empName+"  "+e.empAge+"  "+e.empID);		
			
		}  
		System.out.println("After reversing");
		Collections.reverse(al);                                           //Using Reverse function,Awesome!!!!!!!!!!!!
		for (Employee r:al) {			
			System.out.println(r.empName+"  "+r.empAge+"  "+r.empID);
		}
		System.out.println("After sorting by age");
		Collections.sort(al);                                            // collections sort worked only after creating the compareTo method below,//esay is Use lambda sort!!!!!!!!!!!!
		for (Employee s:al) {			
			System.out.println(s.empName+"  "+s.empAge+"  "+s.empID);
		}
		}
	
	@Override
	public int compareTo(Employee o) { //return this.empAge.compareTo.(o.empAge);//easier one liner
		if(this.empAge==o.empAge) {
		return 0;
	}
		else if(this.empAge>o.empAge) {
			return -1;      //for descending order. For ascending make it 1
			}
		else return 1;      //for descending order. For ascending make it -1
		}
}
