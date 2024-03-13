public class Exercises {
    public static void main(String[] args){
        System.out.println("The smallest number is:" + getSmallestNumber(1.0,2.0,3.0));
        System.out.println("The smallest number is:" + getSmallestNumber(3.0,2.0,1.0));
        System.out.println("The smallest number is:" + getSmallestNumber(3.0,3.0,1.0));
    }
    public static double getSmallestNumber(double num1, double num2, double num3){
        double smallestNumber = num1;
        if (num2 < smallestNumber) {
            smallestNumber = num2;
        }
        if(num3 <smallestNumber){
            smallestNumber = num3;
        }
        return smallestNumber;
    }
}
//Write a Java method to find the smallest number among three numbers
