public class CheckAdultAge implements CheckPerson{

    int lowerBound = 0;
    int upperBound = Integer.MAX_VALUE;
    boolean lowerExclusive = false;
    boolean upperExclusive = true;

    public CheckAdultAge() {}

    public CheckAdultAge(int upperBound) {
        this.upperBound = upperBound;
    }

    public CheckAdultAge(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    public CheckAdultAge(int lowerBound, int upperBound, boolean lowerExclusive, boolean upperExclusive) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        this.lowerExclusive = lowerExclusive;
        this.upperExclusive = upperExclusive;
    }

    public CheckAdultAge setLowerBound(int lowerBound) {
        this.lowerBound = lowerBound;
        return this;
    }

    public CheckAdultAge setUpperBound(int upperBound) {
        this.upperBound = upperBound;
        return this;
    }

    public CheckAdultAge setLowerExclusive(boolean lowerExclusive) {
        this.lowerExclusive = lowerExclusive;
        return this;
    }

    public CheckAdultAge setUpperExclusive(boolean upperExclusive) {
        this.upperExclusive = upperExclusive;
        return this;
    }

    @Override
    public boolean test(Person p) {
        boolean lowerCheck = this.lowerExclusive ? this.lowerBound < p.getAge() : this.lowerBound <= p.getAge();
        boolean upperCheck = this.upperExclusive ? p.getAge() < this.upperBound : p.getAge() <= this.upperBound;

        return lowerCheck && upperCheck;
    }
}
