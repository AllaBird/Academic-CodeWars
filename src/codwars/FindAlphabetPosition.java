package codwars;

public class FindAlphabetPosition {
    //When provided with a letter, return its position in the alphabet.
    //
    //Input :: "a"
    //
    //Ouput :: "Position of alphabet: 1"

    public static String position(char alphabet){
        alphabet=Character.toLowerCase(alphabet);
        return "Position of alphabet: " + String.valueOf(alphabet - 'a' + 1);
    }

    public static void main(String[] args) {
        System.out.println(position('b'));
    }
}
