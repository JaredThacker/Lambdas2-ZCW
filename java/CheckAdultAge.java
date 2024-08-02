public class CheckAdultAge implements CheckPerson{
    @Override
    public boolean test(Person p) {
        return p.getAge() > 21;
    }

    public boolean testAgeRange(Person p, int high, int low){
        return p.getAge() < high && p.getAge() > low;
    }
}
