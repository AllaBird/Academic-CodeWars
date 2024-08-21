package codwars;

public class ReverseString {
   // Complete the solution so that it reverses the string passed into it.
   public static String solution(String str) {
       StringBuilder stringBuilder = new StringBuilder();
       for (int i = str.length()-1; i >=0; i--) {
           stringBuilder.append(str.charAt(i));

       }
       return stringBuilder.toString();
       // return new StringBuilder(str).reverse().toString();

       // String newcad="";
       //
       //    for(int i = str.length()-1; i >= 0; i--){
       //      newcad += str.charAt(i);
       //    }
       //
       //    return newcad;
   }

    public static void main(String[] args) {
        System.out.println(solution("Sam"));
    }
}
