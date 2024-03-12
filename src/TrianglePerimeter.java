public class TrianglePerimeter {
    public static void main(String[] args) {
        double side1 = 3.0;
        double side2 = 4.0;
        double side3 = 5.0;

        double perimeter = calculatePerimeter(side1, side2, side3);
        System.out.println("Perimeter of the triangle: " + perimeter);
    }

    public static double calculatePerimeter(double a, double b, double c) {
        return a + b + c;
    }
}
//Print the perimeter of a triangle by given sides. Use formula to calculate it.