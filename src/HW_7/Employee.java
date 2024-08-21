package HW_7;

public class Employee {
    String name;
    int age;
    boolean sex;
    //true- man
    int salary;

    public boolean isSameName(Employee employee){
        return this.name.equals(employee.name);
    }
}
