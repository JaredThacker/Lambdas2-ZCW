import java.time.LocalDate;
import java.time.Period;

public class Person {

    public enum Sex {
        MALE, FEMALE
    }

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    public int getAge() {
        return Period.between(birthday, LocalDate.now()).getYears();
    }

    public void printPerson() {
        new SocialMedia().members.add(this);
    }
}
