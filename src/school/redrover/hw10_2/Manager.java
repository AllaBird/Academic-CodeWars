package school.redrover.hw10_2;

public final class Manager extends Worker {
    private int numberOfSubordinates;
    protected int GET_VALUE(){
        return 3;
    }

    public Manager(String name, double baseSalary,int numberOfSubbordinates) {
        super(name, baseSalary);
        this.numberOfSubordinates =numberOfSubbordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates){
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates(){
        return numberOfSubordinates;
    }
    @Override
    protected double getSalary(){
        if (numberOfSubordinates == 0) {
            return super.getSalary();
        }
        else {
            return (int)(getBaseSalary() + (getBaseSalary() * numberOfSubordinates * GET_VALUE()/100.0));
        }
    }
}

