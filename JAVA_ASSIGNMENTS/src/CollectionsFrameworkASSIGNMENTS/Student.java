/*package CollectionsFrameworkASSIGNMENTS;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class Student implements Comparable<Student>{				
			//public static Comparator StuMarks = null;
			//public static Comparator StuName = null;
			private String name;
			private char grade;
			private int marks;	
			
			public Student(String name,char grade,int marks) {
				this.name=name;
				this.grade=grade;
				this.marks=marks;
			}								
			public int compareTo(Student other ) {			
				int comparemarks =((Student)other).getmarks();
				return this.marks-comparemarks;
			}	
			
			public int getmarks() {
				return marks;			
			}
			public void setmarks (int marks) {
				this.marks=marks;
			}			
			public String getname() {
				return name;			
			}
			public void setname(String name) {
				this.name=name;
				}
			public char getgrades(char grade) {
				return grade;				
			}
			public void setgrades(char grade) {
				this.grade=grade;
			}
			@Override
			public String toString() {
				return ("Name  "+name+" marks "+marks+"grades "+grade);	
				}	
	/*public class Student {		
		String name;
		int id;
		int age;	
	
	public Student(String name,int id,int age) {
		this.name=name;
		this.id=id;
		this.age=age;
	}
		public static void main(String[] args) {	
		ArrayList<Object> Arr= new ArrayList<Object>();
		Student s1= new Student("lmn",1,9);
		Student s2= new Student("xyz",2,9);
		Student s3= new Student("abc",3,9);
		Student s4= new Student("uvw",4,9);		
		Student s5= new Student("pqr",5,9);		
		ArrayList<String>list=new ArrayList<String>();
		list.add(s1.name);
		list.add(s2.name);
		list.add(s3.name);
		list.add(s4.name);
		list.add(s5.name);
		Collections.sort( list);		
		
		System.out.println("List after sorting: "+list);			
		}		
	}
	*/		
			
			


			
		

			