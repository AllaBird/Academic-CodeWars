package codwars;

import java.util.List;

public class ValidateHello {
    public static boolean validateHello(String greetings){
        List<String> helloWords = List.of("hello", "ciao", "salut", "hallo", "hola", "ahoj", "czesc");
        for (String word: helloWords){
            if (greetings.toLowerCase().contains(word)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(validateHello("hello"));
        System.out.println(validateHello("ciao bella!"));
        System.out.println(validateHello("salut"));
        System.out.println(validateHello("hallo, salut"));
        System.out.println(validateHello("hombre! Hola!"));
        System.out.println(validateHello("Hallo, wie geht\'s dir?"));
        System.out.println(validateHello("AHOJ!"));
        System.out.println(validateHello("czesc"));
        System.out.println(validateHello("Ahoj"));
        System.out.println(validateHello("meh"));
    }
}
