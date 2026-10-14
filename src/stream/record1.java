package stream;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.*;



public class record1 {

    record Employee(
            int id,
            String name,
            String dept,
            double salary,
            LocalDate joiningDate,
            List<String> skills
    ) {}

    static Employee emp(
            int id,
            String name,
            String dept,
            double salary,
            String date,
            String... skills
    ) {
        return new Employee(
                id,
                name,
                dept,
                salary,
                LocalDate.parse(date),
                List.of(skills)
        );
    }

    public static void main(String[] args) {

        List<Employee> employees = List.of(
                emp(1, "Asha",   "Engineering",  90000, "2019-03-01", "Java", "SQL"),

                emp(2, "Ravi",   "Engineering", 120000, "2016-07-15", "Java", "Spring", "AWS"),

                emp(3, "Meera",  "HR",           60000, "2020-01-10", "Recruiting"),

                emp(4, "John",   "Sales",        70000, "2018-11-20", "Negotiation", "CRM"),

                emp(5, "Priya",  "Engineering", 105000, "2021-05-05", "Java", "React"),

                emp(6, "Karan",  "Sales",        65000, "2022-02-14", "CRM"),

                emp(7, "Sara",   "HR",           62000, "2017-09-09", "Recruiting", "Payroll"),

                emp(8, "Vikram", "Finance",      80000, "2015-04-30", "Excel", "SQL"));


//-------------------------------------------------------------------------------------------------------------
        // Q1 onwards: Add your assignment operations here
        List<String> ls = employees.stream()
                .sorted((e1, e2) -> Double.compare(e2.salary(), e1.salary()))
                .map(Employee::name)
                .collect(Collectors.toList());

        System.out.println(ls);

//--------------------------------------------------------------------------------------------------------------
        // Q2
        List<String> ls2 = employees.stream()
                .sorted((e1, e2) -> Double.compare(e2.salary(), e1.salary()))
                .map(Employee::name).limit(3)
                .collect(Collectors.toList());
        System.out.println(ls2);

//---------------------------------------------------------------------------------------------------------------
        //Q3

        List<String> ls3=employees.stream()
                .filter(e -> e.joiningDate().isBefore(LocalDate.of(2018, 1, 1)))
                .sorted(Comparator.comparing(Employee::joiningDate))
                .map(e -> e.name() + " (" + e.joiningDate().getYear() + ")")
                .collect(Collectors.toList());
        System.out.println(ls3);

//---------------------------------------------------------------------------------------------------------------
        //Q4

        String names = employees.stream()
                .map(Employee::name)
                .collect(Collectors.joining(", "));

        System.out.println(names);

    }
}



