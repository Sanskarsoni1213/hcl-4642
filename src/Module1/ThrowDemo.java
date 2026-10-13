
package Module1;

public class ThrowDemo {

    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Age must be 18 or above");
        } else {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) {
        checkAge(16);
        System.out.println("Program ended");
    }
}
