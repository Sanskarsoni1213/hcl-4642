package Module1;

public class switchexp {
    public static void main(String[] args) {

        String day = "Sunday";

        String result = switch (day) {
            case "Monday", "Tuesday", "Wednesday",
                 "Thursday", "Friday" -> "Weekday";

            case "Saturday", "Sunday" -> "Weekend";

            default -> "Invalid day";
        };

        System.out.println("Day: " + day);
        System.out.println("Result: " + result);
    }
}


