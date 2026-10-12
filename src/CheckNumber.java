
@FunctionalInterface
interface CheckNumber1 {
    boolean check(int n);
}

public class CheckNumber {
    public static void main(String[] args) {

        CheckNumber1 evenOdd = n -> n % 2 == 0;

        int num = 7;

        if (evenOdd.check(num)) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
