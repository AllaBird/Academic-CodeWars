package school.redrover.hw10_2;

public abstract class Employee {
    private String name;
    private double  baseSalary;
    private int subordinates;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public Employee(String name, double baseSalary, int subordinates){
        this.name = name;
        this.baseSalary = baseSalary;
        this.subordinates=subordinates;
    }
    public void setName(String name){
        this.name=name;

    }
    public String getName(){
        return name;
    }
    public void setBaseSalary(double baseSalary){
        this.baseSalary=baseSalary;

    }
    public double getBaseSalary(){
        return baseSalary;
    }

    protected abstract double getSalary();

    protected abstract int GET_VALUE();
}
