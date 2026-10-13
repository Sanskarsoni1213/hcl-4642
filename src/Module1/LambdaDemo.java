package Module1;

import java.util.function.Predicate;
import java.util.function.BiFunction;
import java.util.function.Supplier;
import java.util.function.Consumer;

public class LambdaDemo {
    public static void main(String[] args) {
        
        Predicate<Integer> p = n -> n % 2 == 0;
        System.out.println(p.test(2));

        BiFunction<Integer, Integer, Integer> fun =
                (a, b) -> a * b;
        System.out.println(fun.apply(4, 5));

        Supplier<Double> s = () -> Math.random();
        System.out.println(s.get());

        Consumer<String> c = x -> System.out.println(x);
        c.accept("Hello HCL Training");
    }
}
