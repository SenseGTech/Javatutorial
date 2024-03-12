import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide your first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Please provide your middle name: ");
        String middleName = scanner.nextLine();

        System.out.println("Please provide your last name: ");
        String lastName = scanner.nextLine();
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("Hello: " + fullName + " Nice to meet you! :)");
    }
}

//Store your names in 3 different variables and print your whole name.