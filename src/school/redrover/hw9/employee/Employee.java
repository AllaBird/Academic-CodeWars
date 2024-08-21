package school.redrover.hw9.employee;

import school.redrover.hw9.months.Month;

//Задача №2
//Необходимо создать класс Employee с полями: имя, возраст, пол и ЗП в день.
// Все поля сделать приватными и для каждого поля добавить методы set и get.
// Класс должен иметь метод - getSalary(Month[] monthArray),
// метод возвращает зарплату за те месяцы которые были переданы в качестве аргумента.
public final class Employee extends BaseEmployee{
    private String name;
    private int age;
    private char sex;
    private double dailySalary;

    public double getSalary(Month[] monthsArray){
        double sum=0.0;
        for (int i = 0; i < monthsArray.length; i++) {
            sum += monthsArray[i].getWorkdays()*dailySalary;
        }
        return sum;
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
}
