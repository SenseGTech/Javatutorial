public class TriangleArea {
    public static void main(String[] args) {
        double side1 = 3.0;
        double side2 = 4.0;
        double side3 = 5.0;

        double area = calculateArea(side1, side2, side3);
        System.out.println("Area of the triangle: " + area);
    }

    public static double calculateArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
//Print the area of a triangle by given sides. Use formula to calculate it.