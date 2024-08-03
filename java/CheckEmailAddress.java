public class CheckEmailAddress implements CheckPerson{

    String validateString = "@";

    public CheckEmailAddress(String validator) {
        this.validateString = validator;
    }

    @Override
    public boolean test(Person p) {
        return p.getEmailAddress().contains(validateString);
    }
}
