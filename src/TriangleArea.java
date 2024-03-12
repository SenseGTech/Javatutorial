import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the lengths of the three sides of the triangle
        System.out.println("Enter the lengths of the three sides of the triangle:");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();

        // Calculate the semi-perimeter of the triangle
        double semiPerimeter = (side1 + side2 + side3) / 2;

        // Calculate the area using Heron's formula
        double area = Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));

        // Output the area
        System.out.println("The area of the triangle is: " + area);

        scanner.close();
    }
}
//Print the area of a triangle by given sides. Use formula to calculate it.