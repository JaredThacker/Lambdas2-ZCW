import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        Random random = new Random(System.currentTimeMillis());

        for (int i = 0; i < 10; i++) {
            int year = random.nextInt(1950, 2000);
            Person person = new Person();
            person.setName("Person " + (i + 1));
            person.setBirthday(LocalDate.of(year + (i % 10), (i % 12) + 1, (i % 28) + 1));
            person.setGender(i % 2 == 0 ? Person.Sex.MALE : Person.Sex.FEMALE);
            person.setEmailAddress("person" + (i + 1) + "@example.com");
            people.add(person);
        }

        //local
        SocialMedia.printPersons(people, new CheckAdultAge());

        //anonymous
        SocialMedia.printPersons(people, new CheckPerson() {
            @Override
            public boolean test(Person p) {
                return p.getAge() >= 0;
            }
        });

        //lambda
        SocialMedia.printPersons(people, (person) -> person.getAge() >= 0);
    }
}
