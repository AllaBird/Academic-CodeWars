package school.redrover.hw10_2;


public final class Director extends Employee {

    public Director(String name, double baseSalary, int numberOfSubordinates) {
        super(name, baseSalary, numberOfSubordinates);
    }

    @Override
    protected double getSalary() {
        return GET_VALUE();
    }

    @Override
    protected int GET_VALUE() {
        return 9;
    }
}
