public class CheckGenderFemale implements CheckPerson{
    @Override
    public boolean test(Person p) {
        return p.getGender() == Person.Sex.FEMALE;
    }
}
