import java.util.Scanner;

public class DayOfWeekPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a digit (1-7): ");
        int userInput = scanner.nextInt();

        String dayOfWeek = getDayOfWeek(userInput);

        System.out.println("The " + getDaySuffix(userInput) + " day of the week is " + dayOfWeek);

        scanner.close();
    }

    private static String getDayOfWeek(int userInput) {
        switch (userInput) {
            case 1:
                return "Sunday";
            case 2:
                return "Monday";
            case 3:
                return "Tuesday";
            case 4:
                return "Wednesday";
            case 5:
                return "Thursday";
            case 6:
                return "Friday";
            case 7:
                return "Saturday";
            default:
                return "Invalid input";
        }
    }

    private static String getDaySuffix(int day) {
        if (day >= 11 && day <= 13) {
            return day + "th";
        }
        switch (day % 10) {
            case 1:
                return day + "st";
            case 2:
                return day + "nd";
            case 3:
                return day + "rd";
            default:
                return day + "th";
        }
    }
}
//Write a program to print the days of the week based on the user digit 1-7 input.
// The message should be “The [user input digit]-st/nd/rd/thday of the week is [the day of the week]”
// Hint: Use switch-case.

