package school.redrover.hw9;

import school.redrover.hw9.employee.Employee;
import school.redrover.hw9.months.Month;
import school.redrover.hw9.months.MonthUtils;
import school.redrover.hw9.plates.LicensePlate;
import school.redrover.hw9.plates.LicensePlateMaker;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Employee jim = new Employee();
        jim.setName("Jim Halper");
        jim.setDailySalary(100);
        System.out.println(jim.getSalary(new Month[]{MonthUtils.JANUARY,MonthUtils.JULY}));

        Manager michael= new Manager();
        michael.setName("Michael");
        michael.setDailySalary(100);
        michael.setNumberOfSubordiates(5);

        System.out.println(michael.getSalary(MonthUtils.ALL_MONTHS));
        System.out.println("++++++++++++++++++");
        //System.out.println(Arrays.toString(MonthUtils.getFirstKvartal()));

        System.out.println("---------------------------");

        LicensePlateMaker nyMaker= new LicensePlateMaker("NY",1000);


        System.out.println(nyMaker.makeNextPlate().getPlate());
        System.out.println(nyMaker.makeNextPlate().getPlate());
    }
}