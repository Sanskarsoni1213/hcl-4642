
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    String name;
    int rollno;

    Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }
}

class MyComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.rollno, s2.rollno);
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {

        List<Student> ls = new ArrayList<>();

        ls.add(new Student("Aman", 3));
        ls.add(new Student("Riya", 1));
        ls.add(new Student("Rahul", 2));

        Collections.sort(ls, new MyComparator());

        for (Student s : ls) {
            System.out.println(s.name + " " + s.rollno);
        }
    }
}

