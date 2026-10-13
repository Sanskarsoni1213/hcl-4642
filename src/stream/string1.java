
package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class string1 {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(Arrays.asList(
                "rat", "rabbit", "restart", "result",
                "root", "robot", "cat", "apple",
                "right", "rust", "rat"
        ));

        System.out.println("Original List: " + names);

        System.out.println("\nStarts with r:");
        names.stream()
                .filter(s -> s.startsWith("r"))
                .forEach(System.out::println);

        System.out.println("\nEnds with t:");
        names.stream()
                .filter(s -> s.endsWith("t"))
                .forEach(System.out::println);


        System.out.println("\nStarts with r and ends with t:");
        names.stream()
                .filter(s -> s.startsWith("r") && s.endsWith("t"))
                .forEach(System.out::println);


        System.out.println("\nContains 'at':");
        names.stream()
                .filter(s -> s.contains("at"))
                .forEach(System.out::println);


        System.out.println("\nLength greater than 4:");
        names.stream()
                .filter(s -> s.length() > 4)
                .forEach(System.out::println);


        System.out.println("\nUppercase:");
        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        System.out.println("\nSorted:");
        names.stream()
                .sorted()
                .forEach(System.out::println);


        System.out.println("\nDistinct strings:");
        names.stream()
                .distinct()
                .forEach(System.out::println);


        long count = names.stream()
                .filter(s -> s.startsWith("r"))
                .count();

        System.out.println("\nCount starting with r: " + count);

        List<String> result = names.stream()
                .filter(s -> s.startsWith("r") && s.endsWith("t"))
                .collect(Collectors.toList());

        System.out.println("\nCollected result: " + result);

        names.stream()
                .filter(s -> s.startsWith("r"))
                .findFirst()
                .ifPresent(s -> System.out.println("\nFirst match: " + s));


        boolean anyMatch = names.stream()
                .anyMatch(s -> s.endsWith("t"));

        System.out.println("\nAny string ends with t? " + anyMatch);

        names.stream()
                .map(name -> "Mr. " + name)
                .forEach(System.out::println);
    }
}
