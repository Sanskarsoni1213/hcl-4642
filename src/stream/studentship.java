
package stream;

import java.util.ArrayList;

class Student {
    String name;
    int age;
    int rollNo;

    Student(String name, int age, int rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Name: " + name
                + ", Age: " + age
                + ", Roll No: " + rollNo;
    }
}

public class studentship {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Rahul", 22, 103));
        students.add(new Student("Aman", 19, 101));
        students.add(new Student("Rohit", 21, 102));
        students.add(new Student("Priya", 18, 104));

        students.sort((s1, s2) -> s1.age - s2.age);

        students.forEach(System.out::println);
    }
}
