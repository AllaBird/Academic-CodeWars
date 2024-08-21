package codwars;

public class CamelCase {
    static String toCamelCase(String s) {
        String[] parts = s.split("[_,-]");
        StringBuilder camelCase = new StringBuilder(parts[0]);

        for (int i = 1; i < parts.length; i++) {
            if (parts[i].length() > 0) {
                camelCase.append(parts[i].substring(0, 1).toUpperCase())
                        .append(parts[i].substring(1).toLowerCase());
            }
        }
        return camelCase.toString();
    }


    public static void main(String[] args) {
        System.out.println(toCamelCase("the_Stealth_Warrior"));
    }
}
