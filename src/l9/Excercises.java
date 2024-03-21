package l9;

public class Excercises {
    public static void main(String[] args) throws Exception {
        String validEGNBefore2000 = "9706244444";
        String validEGNAfter2000 = "2030014444";
        String invalidEGNAfter2000 = "2002014444";
        String invalidEGNLength = "12345678901";
        String negativeEGNLength = "-12345678901";
        String invalidEGN = "gosho";
        String bulgarian = "Bulgarian";
        String italian = "italian";
        String english = "english";
        String finish = "finish";
        Person George = new Person("George", 'm',"Islam","Bulgarian","QA",bulgarian,validEGNBefore2000, "Bulgaria");

        //System.out.println(George.dateOfBirth);
        //System.out.println(George.age);
        //George.age = 21;
        //System.out.println(George.age);
        George.sayHello();
    }
}
