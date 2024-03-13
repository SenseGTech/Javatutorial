package main.java.lab.I7.exceptions;


import java.io.FileNotFoundException;
import java.io.FileReader;

public class Examples {
    public static void main(String[] args) {
       testTryCatch("src/main/java/lab/I7/exceptions/testFile.text");
        //testUncheckedException();
    }

   /* public static void testCheckedException() {
        File file = new File("main/java/lab/17/exeptions/testFile.text");
        FileReader fr = new FileReader(file);
    }*/
    public static void testTryCatch(){
        int[] num = {1,2,3,4};
        System.out.println(num[4]);
    }
    public static void testTryCatch (String filePath){
        try {
            FileReader filereader = new FileReader(filePath);
        } catch (FileNotFoundException e) {
            System.out.println("The file is not found! Please check the file name and path and try again!");
        }
    }
}
