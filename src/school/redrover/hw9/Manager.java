package school.redrover.hw9;

import school.redrover.hw9.employee.BaseEmployee;
import school.redrover.hw9.months.Month;

public final class Manager extends BaseEmployee {
    private String name;
    private int age;
    private char sex;
    private double dailySalary;
    private int numberOfSubordiates;

    public double getSalary(Month[] monthsArray){
        double sum=0.0;
        for (int i = 0; i < monthsArray.length; i++) {
            sum += monthsArray[i].getWorkdays()*dailySalary;
        }
        return sum*(1+ numberOfSubordiates*0.01);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getDailySalary() {
        return dailySalary;
    }

    public void setDailySalary(double dailySalary) {
        this.dailySalary = dailySalary;
    }

    public int getNumberOfSubordiates() {
        return numberOfSubordiates;
    }

    public void setNumberOfSubordiates(int numberOfSubordiates) {
        this.numberOfSubordiates = numberOfSubordiates;
    }
}
