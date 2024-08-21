package school.redrover.hw9.months;
//Создать класс Month с полями: имя месяца, количеством дней и количеством рабочих дней.
// Создать класс MonthUtils который бы хранил подготовленные месяцы
// или их массивы для использования (объекты класса Month).
public final class Month {
    private String nameOfMonth;
    private int totalDays;
    private int workdays;

    public Month(String nameOfMonth, int totalDays, int workdays) {
        this.nameOfMonth = nameOfMonth;
        this.totalDays = totalDays;
        this.workdays = workdays;
    }

    public String getNameOfMonth() {
        return nameOfMonth;
    }

    public int getTotalDays() {
        return totalDays;
    }

    public int getWorkdays() {
        return workdays;
    }
    public static Month[] getKvartal(int NumerOfKvartal){
return  null;
        //return new Month[]{JANUARY,FEBRUARY,MARCH};
    }
}
