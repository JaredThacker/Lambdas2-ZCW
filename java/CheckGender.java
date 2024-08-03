public class CheckGender implements CheckPerson{

    Person.Sex genderCriteria;

    public CheckGender() {
        this.genderCriteria = Person.Sex.MALE;
    }

    public CheckGender(Person.Sex filterValue) {
        this.genderCriteria = filterValue;
    }

    @Override
    public boolean test(Person p) {
        return p.getGender().equals(this.genderCriteria);
    }
}
