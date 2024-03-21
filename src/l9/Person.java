package l9;


import java.time.LocalDate;

public class Person {
    String name;
    char sex;
    String religion;
    String language;
    String job;
    String nationality;
    String egn;
    LocalDate dateOfBirth;
    int age;
    String country;

    public Person(String name, char sex, String religion, String language, String job, String nationality, String egn, String country) throws Exception {
        this.name = name;
        this.sex = sex;
        this.religion = religion;
        this.language = language;
        this.job = job;
        this.nationality = nationality;
        this.egn = validateEgn(egn);
        this.country = country;
        this.dateOfBirth = getDateOfBirth(egn);
        this.age = getAge (dateOfBirth);
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    private int getAge(LocalDate dateOfBirth){
       return LocalDate.now().getYear() - dateOfBirth.getYear();

    }
    //9702014444
    //012
    private LocalDate getDateOfBirth(String egn) {
        int year = Integer.parseInt(egn.substring(0,2)); //97
        int month = Integer.parseInt(egn.substring(2,4)); //02
        int day = Integer.parseInt(egn.substring(4,6)); //01
        if(month > 40){
            //year 97
            year = year + 1997;
            //month = 02;
            month = month - 40;//02
        }else{
            //year=97;
            year = year + 2000;
        }
        return LocalDate.of(year,month,day);
    }

    private String validateEgn(String egn) throws Exception {
        if(egn.length() == 10 && containsOnlyDigits(egn)) {
            return egn;
        }else {
            throw new IllegalArgumentException("The provided EGN is not valid! The EGN must contain only ID digits!");
        }
    }

    private boolean containsOnlyDigits(String egn) {
        try {
            Long.parseLong(egn);
            return true;
        } catch(NumberFormatException e){
            return false;
        }

    }
}
/**Create class Person which has the following attributes: name, sex, religion, language spoken,
 *  job, nationality, EGN, date of birth, age, country of residence. The date of birth attribute
 *  and age are composed during the creation of an object based on the EGN.
 *  EGN consists of 10 digits. If provided value for EGN or sex are not correct throw exception.
 *  If wrong sex is provided program must continue its normal execution with printing relevant message.
 *  Only job and country of residence could change their values. All other attributes can`t be changes once they are set.
 *
 */