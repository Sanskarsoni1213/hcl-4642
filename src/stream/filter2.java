
package stream;

import java.util.ArrayList;
import java.util.Arrays;

public class filter2{

    public static void main(String[] args) {

        ArrayList<Integer> list1 =
                new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        ArrayList<Integer> list2 =
                new ArrayList<>(Arrays.asList(7, 8, 9, 10, 11, 12));

        System.out.println("Even numbers from List 1:");
        list1.stream()
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.println(n));

        System.out.println("Even numbers from List 2:");
        list2.stream()
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.println(n));
    }
}
