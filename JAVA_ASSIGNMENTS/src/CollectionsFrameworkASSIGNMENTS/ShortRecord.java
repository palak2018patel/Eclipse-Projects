package CollectionsFrameworkASSIGNMENTS;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class ShortRecord {
	static class SortByMark implements Comparator<Student>
	{
		@Override
		public int compare(Student o1, Student o2) {
			
			return o1.getmarks().compareTo(o2.getmarks());
		}
		
	}	
	
	static class Student
	{				
		private String name;
		private Integer marks;	
		
		public Student(String name,Integer marks) {
			this.name=name;
			
			this.marks=marks;
		}								
				
		public Integer getmarks() {
			return marks;			
		}
		public void setmarks (Integer marks) {
			this.marks=marks;
		}			
		public String getname() {
			return name;			
		}
		public void setname(String name) {
			this.name=name;
			}
		
		@Override
		public String toString() {
			return ("Name  "+name+" marks "+marks);	
			}	
	
		private final static  SortByMark sortByMark=new SortByMark();;
		public static void main(String[] args) {	
			
			Student s1= new Student("lmn",9);
			Student s2= new Student("xyz",4);
			Student s3= new Student("abc",7);
			Student s4= new Student("uvw",2);		
			Student s5= new Student("pqr",3);		
			ArrayList<Student>list=new ArrayList<Student>();
			list.add(s1);
			list.add(s2);
			list.add(s3);
			list.add(s4);
			list.add(s5);
			Collections.sort( list,sortByMark);{
			for (Student s:list) {	
				
				System.out.println(s);
			}

	}

		}
	}
}
	
