package HW_7;

public class Person {
    String name;
    int age;
    boolean sex;
    //true- man

    public String getName() {
        if (sex == true) {
            return "Mr."+ name;
        } else{
            return "Mrs."+ name;
        }

    }
}

