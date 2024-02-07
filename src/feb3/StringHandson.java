package feb3;

import java.util.Locale;

public class StringHandson {
    public static void main(String[] args) {
        String s1 = "hello";
        System.out.println(s1.charAt(3));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.concat(" it's a test"));
        System.out.println(s1.compareToIgnoreCase("HeLLo"));
        System.out.println(s1.endsWith("o"));
        System.out.println(s1.isBlank());
    }
}
