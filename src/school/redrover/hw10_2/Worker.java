package school.redrover.hw10_2;

public class Worker extends Employee {
    public Worker(String name, double baseSalary) {
        super(name, baseSalary);


    }
    public final double getBaseSalary(){
        return super.getBaseSalary();

    }
    @Override
    protected double getSalary(){
        return getBaseSalary();
    }

    @Override
    protected int GET_VALUE() {
        return 0;
    }
}
