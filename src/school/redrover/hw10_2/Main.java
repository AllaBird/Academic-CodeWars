package school.redrover.hw10_2;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                                new Worker("Anna", 1000),
                                new Manager("Leo", 2000, 5),
                                new Director("Joe",3000,10)
                        };
        Manager[] man={
                new Manager("Leila",2000,10),
                new Manager("Ben",2500,15),
                new Manager("Inna",2800,16)
                };

        EmployeeUtils employeeUtils =new EmployeeUtils();
        System.out.println(employeeUtils.findByName(employees,"Anna"));
        System.out.println(employeeUtils.findBySubname(employees,"oe"));
        System.out.println(employeeUtils.getTotalSalary(employees));
        System.out.println(employeeUtils.getMinSalary(employees));
        System.out.println(employeeUtils.getMaxSalary(employees));
        System.out.println(employeeUtils.getMinNumberOfSubordinates(man));
        System.out.println(employeeUtils.getMaxNumberOfSubordinates(man));
        System.out.println(employeeUtils.getMaxBonus(man));
        System.out.println(employeeUtils.getMinBonus(man));

    Director a = new Director("Sam", 2000, 8);
        System.out.println(a.getSalary());
    }
}