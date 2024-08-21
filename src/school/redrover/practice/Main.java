package school.redrover.practice;



public class Main {
    public static void main(String[] args) {


        Student[] all = {new Student("Vasya", "Petrov", "a", 4.0),
                new Aspirant("Petya", "Ivanov", "x", 5.0,"r")};

        for (int i = 0; i < all.length; i++) {
            System.out.println((all[i]).getScholarship());


        }


    }
}
