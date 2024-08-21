package school.redrover.hw10_2;
public class EmployeeUtils {
    public Employee findByName(Employee[]employees,String name){
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getName().equals(name)){
                return employees[i];
            }

        }
        return null;
    }

    public Employee findBySubname(Employee[]employees, String subName){
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getName().contains(subName)){
                return employees[i];
            }
        }
        return null;
    }

    public double getTotalSalary(Employee[]employees){
        int buget=0;
        for (int i = 0; i < employees.length; i++) {
            buget+= (int) employees[i].getSalary();


        }
        return buget;
    }

    public double getMinSalary(Employee[]employees){
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getSalary()<min){
                min= (int) employees[i].getSalary();
            }

        }
        return min;
    }
    public double getMaxSalary(Employee[]employees){
        int max=0;
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getSalary()>max){
                max= (int) employees[i].getSalary();
            }

        }
        return max;
    }

   public int getMinNumberOfSubordinates(Manager[]managers){
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < managers.length; i++) {
            if(managers[i].getNumberOfSubordinates()<min){
                min=managers[i].getNumberOfSubordinates();
            }

       }
        return min;
   }

   public int getMaxNumberOfSubordinates (Manager[]managers){
        int max=0;
       for (int i = 0; i < managers.length; i++) {
           if(managers[i].getNumberOfSubordinates()>max){
               max=managers[i].getNumberOfSubordinates();
           }

       }
       return max;
   }

   public double getMaxBonus (Manager[] managers) {
        int maxBonus = 0;
       for (int i = 0; i < managers.length; i++) {
           double bonus = managers[i].getSalary()-managers[i].getBaseSalary();
           if( bonus>maxBonus){
               maxBonus= (int) bonus;
           }
       }
       return maxBonus;
   }

   public double getMinBonus (Manager[] managers){
        int minBonus = Integer.MAX_VALUE;
       for (int i = 0; i < managers.length; i++) {
           double bonus = managers[i].getSalary()-managers[i].getBaseSalary();
           if(bonus<minBonus){
               minBonus= (int) bonus;
           }

       }
       return minBonus;
   }

}
