package CollectionsFrameworkASSIGNMENTS;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Stu
{
    static class SortByMark implements Comparator<Student>
    {
        @Override
        public int compare(Student studentOne, Student studentTwo)
        {
            return studentOne.mark.compareTo(studentTwo.mark);
        }
    }

    static class Student
    {
        private final Double mark;
        private final String name;

        public Student(String name, Double mark)
        {
           this.name = name;
            this.mark = mark;
        }

        public Double getMark()
        {
            return mark;
        }

        public String getName()
        {
            return name;
        }

        @Override
        public String toString()
        {
            return name + ": " + mark;
        }
    }

    private final static SortByMark sortByMark = new SortByMark();;

    public static void main(String args[])
    {
        List<Student> students = new ArrayList<Student>();
        
        

        students.add(new Student("Zara",  (3434.34)));
        students.add(new Student("Mahnaz", (123.22)));
        students.add(new Student("Ayan", (1378.00)));
        students.add(new Student("Daisy", (99.22)));
        students.add(new Student("Qadir", (-19.08)));

        Collections.sort(students, sortByMark);

        for (Student student : students)
        {
            System.out.println(student);
        }
    }
}




