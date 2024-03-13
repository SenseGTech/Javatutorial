package main.java.lab.I7.exceptions;



public class Examples {
    public static void main(String[] args) {
        testUncheckedException();
    }

   /* public static void testCheckedException() {
        File file = new File("main/java/lab/17/exeptions/testFile.text");
        FileReader fr = new FileReader(file);
    }*/
    public static void testUncheckedException(){
        int[] num = {1,2,3,4};
        System.out.println(num[0]);
    }
}
