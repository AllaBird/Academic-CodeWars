package school.redrover.practice;

public class Aspirant extends Student{
    private String courserang;
    public Aspirant(String firstName, String lastName, String group, double averageMark,String courserang) {
        super(firstName, lastName, group, averageMark);
        this.courserang=courserang;
    }

    @Override
    public double getScholarship(){
        if(getAverageMark()==5){
            return 2500;
        }
        return 2200;
    }
}
