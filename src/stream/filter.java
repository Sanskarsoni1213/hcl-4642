
package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filter{

    public static void main(String[] args) {

        ArrayList<Integer> list1 =
                new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        ArrayList<Integer> list2 =
                new ArrayList<>(Arrays.asList(7, 8, 9, 10, 11, 12));

        List<Integer> even1 = list1.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        List<Integer> even2 = list2.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Even numbers from List 1: " + even1);
        System.out.println("Even numbers from List 2: " + even2);
    }
}
